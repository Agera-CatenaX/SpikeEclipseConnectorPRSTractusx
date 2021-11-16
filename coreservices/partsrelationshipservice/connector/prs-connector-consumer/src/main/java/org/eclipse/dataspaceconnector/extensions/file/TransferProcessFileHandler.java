package org.eclipse.dataspaceconnector.extensions.file;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.eclipse.dataspaceconnector.spi.monitor.Monitor;
import org.eclipse.dataspaceconnector.spi.types.domain.transfer.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Collections.emptyList;
import static java.util.Comparator.comparingInt;

public class TransferProcessFileHandler implements StatusChecker {

    private final Monitor monitor;

    public TransferProcessFileHandler(Monitor monitor) {
        this.monitor = monitor;
    }

    @Override
    public boolean isComplete(TransferProcess transferProcess, List<ProvisionedResource> list) {
        boolean exists = getDestinationPath(transferProcess).toFile().exists();
        if (exists) {
            monitor.debug("File is ready for process " + transferProcess.getId());
        }
        return exists;
    }

    public TransferProcessFile parse(TransferProcess process) {
        Path destinationPath = getDestinationPath(process);

        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.readValue(destinationPath.toFile(), TransferProcessFile.class);
        } catch (IOException e) {
            monitor.severe("Could not parse file for process " + process.getId(), e);
        }

        return new TransferProcessFile("error", -1, emptyList());
    }

    public void aggregate(Stream<TransferProcess> processes, String destinationPath) {
        String aggregatedResult = processes
                .map(this::parse)
                .sorted(comparingInt(TransferProcessFile::getOrder))
                .map(TransferProcessFile::getValue)
                .collect(Collectors.joining(" "));
        Path path = Path.of(destinationPath);
        try {
            Files.writeString(path, aggregatedResult);
        } catch (IOException e) {
            monitor.severe("Error aggregating file", e);
        }
    }

    private Path getDestinationPath(TransferProcess process) {
        var destination = process.getDataRequest().getDataDestination();
        var destinationPath = Path.of(destination.getProperty("path"));
        return Path.of(destinationPath.toString(), process.getDataRequest().getDataEntry().getId());
    }
}