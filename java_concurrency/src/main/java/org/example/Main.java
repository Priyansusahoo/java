package org.example;

import org.example.service.ThreadManager;

public class Main {
    public static void main(String[] args) {
        String inputDir = "src/main/resources/input_files";
        String outputDir = "src/main/resources/output_files";

        ThreadManager threadManager = new ThreadManager(inputDir, outputDir);

        threadManager.startProcessing();
    }
}