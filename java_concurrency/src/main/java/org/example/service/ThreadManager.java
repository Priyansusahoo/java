package org.example.service;

import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadManager {
    private final String inputDir;
    private final String outputDir;

    public ThreadManager(String inputDir, String outputDir) {
        this.inputDir = inputDir;
        this.outputDir = outputDir;
    }

    public void startProcessing() {
        // Implement the logic here
        File folder = new File(inputDir);
        File[] files = folder.listFiles();

        if (files == null || files.length == 0) {
            System.out.println("No files found in input directory.");
            return;
        }

        ExecutorService executor = Executors.newFixedThreadPool(4);

        for (File file : files) {
            executor.submit(new FileProcessor(file, outputDir));
        }

        executor.shutdown();
        while (!executor.isTerminated()) {
            // Wait for all threads to finish
        }

        System.out.println("All files processed.");
    }
}
