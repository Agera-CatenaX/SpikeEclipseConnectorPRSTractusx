//
// Copyright (c) 2021 Copyright Holder (Catena-X Consortium)
//
// See the AUTHORS file(s) distributed with this work for additional
// information regarding authorship.
//
// See the LICENSE file(s) distributed with this work for
// additional information regarding license terms.
//
package net.catenax.prs.integrationtest;

import com.catenax.partsrelationshipservice.dtos.PartAttribute;
import com.catenax.partsrelationshipservice.dtos.PartLifecycleStage;
import com.catenax.partsrelationshipservice.dtos.messaging.PartAspectUpdateEvent;
import com.catenax.partsrelationshipservice.dtos.messaging.PartAttributeUpdateEvent;
import com.catenax.partsrelationshipservice.dtos.messaging.PartRelationshipUpdateEvent;
import com.github.javafaker.Faker;
import net.catenax.prs.testing.DtoMother;

import java.time.Instant;
import java.util.List;

/**
 * Object Mother to generate data for integration tests.
 *
 * @see <a href="https://martinfowler.com/bliki/ObjectMother.html">
 * https://martinfowler.com/bliki/ObjectMother.html</a>
 */
public class PrsUpdateEventMother {

    /**
     * JavaFaker instance used to generate random data.
     */
    private final transient Faker faker = new Faker();

    /**
     * Dto mother object that generates test data.
     */
    private final DtoMother generate = new DtoMother();

    /**
     * Samples of the data for PRS Api.
     */
    private final PartsTreeApiResponseMother samples = new PartsTreeApiResponseMother();


    /**
     * Generate a {@link PartAttributeUpdateEvent} with sample data.
     * @return see {@link PartAttributeUpdateEvent}.
     */
    public PartAttributeUpdateEvent sampleAttributeUpdateEvent() {
        return PartAttributeUpdateEvent.builder()
                .withEffectTime(Instant.now())
                .withPart(samples.gearwheelpinPartId1())
                .withName(PartAttribute.PART_TYPE_NAME)
                .withValue(faker.lorem().word())
                .build();
    }

    /**
     * Generate a {@link PartAttributeUpdateEvent} with sample data.
     * @param time effect time.
     * @return see {@link PartAttributeUpdateEvent}.
     */
    public PartAttributeUpdateEvent sampleAttributeUpdateEvent(Instant time) {
        return PartAttributeUpdateEvent.builder()
                .withEffectTime(time)
                .withPart(samples.gearwheelpinPartId1())
                .withName(PartAttribute.PART_TYPE_NAME)
                .withValue(faker.lorem().word())
                .build();
    }

    /**
     * Generate a {@link PartAttributeUpdateEvent} with sample data.
     * @return see {@link PartAttributeUpdateEvent}.
     */
    public PartAspectUpdateEvent sampleAspectsUpdateEvent() {

        return PartAspectUpdateEvent.builder()
                .withEffectTime(Instant.now())
                .withPart(samples.gearwheelpinPartId1())
                .withAspects(List.of(generate.partAspect()))
                .build();
    }

    /**
     * Generate a {@link PartAspectUpdateEvent} with sample data.
     * @param time effect time.
     * @return see {@link PartAspectUpdateEvent}.
     */
    public PartAspectUpdateEvent sampleAspectsUpdateEvent(Instant time) {

        return PartAspectUpdateEvent.builder()
                .withEffectTime(time)
                .withPart(samples.gearwheelpinPartId1())
                .withAspects(List.of(generate.partAspect()))
                .build();
    }

    /**
     * Generate a {@link PartRelationshipUpdateEvent.RelationshipUpdate} with sample data.
     * @return see {@link PartRelationshipUpdateEvent.RelationshipUpdate}.
     */
    protected PartRelationshipUpdateEvent.RelationshipUpdate sampleRelationshipUpdate() {
        return PartRelationshipUpdateEvent.RelationshipUpdate.builder()
                .withEffectTime(Instant.now())
                .withRemove(false)
                .withStage(PartLifecycleStage.BUILD)
                .withRelationship(generate.partRelationship())
                .build();
    }

    /**
     * Generate a {@link PartRelationshipUpdateEvent.RelationshipUpdate} with sample data.
     * @param time effect time.
     * @return see {@link PartRelationshipUpdateEvent.RelationshipUpdate}.
     */
    protected PartRelationshipUpdateEvent.RelationshipUpdate sampleRelationshipUpdate(Instant time) {
        return PartRelationshipUpdateEvent.RelationshipUpdate.builder()
                .withEffectTime(time)
                .withRemove(false)
                .withStage(PartLifecycleStage.BUILD)
                .withRelationship(generate.partRelationship())
                .build();
    }
}
