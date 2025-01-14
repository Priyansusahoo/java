package org.example.service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class FileProcessor implements Runnable{
    private final File file;
    private final String outputDir;

    public FileProcessor(File file, String outputDir) {
        this.file = file;
        this.outputDir = outputDir;
    }

    @Override
    public void run() {
        try {
            processFile();
        } catch (IOException e) {
            System.err.println("Error processing file: "
                    + file.getName()
                    + ", "
                    + e.getMessage());
        }
    }

    private void processFile() throws IOException {
        // Process the file
        List<String> lines = Files.readAllLines(file.toPath());
        int sum = lines.stream().mapToInt(Integer::parseInt).sum();
        String result = "File: "
                + file.getName()
                + ", Sum: "
                + sum;
        // write the result to the output file
        File outputFile = new File(outputDir + "/" + file.getName());
        Files.writeString(outputFile.toPath(), result);
        System.out.println("Processed: " + file.getName());
    }
}
