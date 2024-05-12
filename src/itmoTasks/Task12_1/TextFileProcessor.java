package itmoTasks.Task12_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TextFileProcessor {

    public static void convertTextFileToUpperCase(Path inputFile, Path outputFile) throws IOException {
        try (BufferedReader reader = Files.newBufferedReader(inputFile);
             BufferedWriter writer = Files.newBufferedWriter(outputFile)) {

            String line;
            while ((line = reader.readLine()) != null) {
                String upperCaseLine = line.toUpperCase() + System.lineSeparator();
                writer.write(upperCaseLine);
            }
        }
    }
}