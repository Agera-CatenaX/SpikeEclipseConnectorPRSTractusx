package net.catenax.prs.mappers;

import com.catenax.partsrelationshipservice.dtos.*;
import net.catenax.prs.entities.*;
import net.catenax.prs.testing.DtoMother;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class PartRelationshipEntityListToDtoMapperTests {

    EntitiesMother generate = new EntitiesMother();
    DtoMother generateDto = new DtoMother();
    @Mock
    PartAspectEntityToDtoMapper aspectMapper;
    @Mock
    PartRelationshipEntityToDtoMapper relationshipMapper;
    @Mock
    PartIdEntityPartToDtoMapper idMapper;
    @InjectMocks
    PartRelationshipEntityListToDtoMapper sut;

    PartIdEntityPart car1 = generate.partId();
    PartIdEntityPart gearbox1 = generate.partId();
    PartIdEntityPart gearwheel1 = generate.partId();
    PartRelationshipEntity car1_gearbox1 = generate.partRelationship(car1, gearbox1);
    PartRelationshipEntity gearbox1_gearwheel1 = generate.partRelationship(gearbox1, gearwheel1);
    PartAspectEntity car1_a = generate.partAspect(car1);
    PartAspectEntity gearwheel1_a = generate.partAspect(gearwheel1);
    List<PartRelationshipEntity> relations = List.of(car1_gearbox1, gearbox1_gearwheel1);
    List<PartIdEntityPart> partIds = List.of(car1, gearbox1, gearwheel1);
    List<PartAspectEntity> aspects = List.of(car1_a, gearwheel1_a);
    List<PartRelationship> relationsDto = relations.stream().map(s -> generateDto.partRelationship()).collect(Collectors.toList());
    List<PartId> partIdsDto = partIds.stream().map(s -> generateDto.partId()).collect(Collectors.toList());
    List<Aspect> aspectsDto = aspects.stream().map(s -> generateDto.partAspect()).collect(Collectors.toList());
    List<PartAttributeEntity> typeNames = partIds.stream().map(p -> generate.partTypeName(p)).collect(Collectors.toList());

    @Test
    void toPartRelationshipsWithInfos() {
        // Arrange
        typeNames.remove(0); // Test case when type name is missing
        zip(partIds, partIdsDto)
                .forEach(i -> when(idMapper.toPartId(i.getKey())).thenReturn(i.getValue()));
        zip(relations, relationsDto)
                .forEach(i -> when(relationshipMapper.toPartRelationship(i.getKey())).thenReturn(i.getValue()));
        zip(aspects, aspectsDto)
                .forEach(i -> when(aspectMapper.toAspect(i.getKey())).thenReturn(i.getValue()));

        // Act
        var output = sut.toPartRelationshipsWithInfos(relations, partIds, typeNames, aspects);

        // Assert
        List<PartInfo> expectedPartInfos = List.of(
                // Case with missing type name and non-missing aspect
                generateDto.partInfo(partIdsDto.get(0), null, aspectsDto.get(0)),
                // Case with non-missing type name and missing aspect
                generateDto.partInfo(partIdsDto.get(1), typeNames.get(0).getValue(), null),
                // Case with non-missing type name and non-missing aspect
                generateDto.partInfo(partIdsDto.get(2), typeNames.get(1).getValue(), aspectsDto.get(1))
        );
        assertThat(output).usingRecursiveComparison()
                .isEqualTo(
                        (PartRelationshipsWithInfos.builder()
                                .withRelationships(relationsDto)
                                .withPartInfos(expectedPartInfos)
                                .build()));
    }

    private static <L, R> Stream<Pair<L, R>> zip(List<L> left, List<R> right) {
        if (left.size() != right.size()) {
            throw new IllegalArgumentException("Sizes should match");
        }
        return IntStream.range(0, left.size())
                .mapToObj(i -> new ImmutablePair<>(left.get(i), right.get(i)));
    }
}