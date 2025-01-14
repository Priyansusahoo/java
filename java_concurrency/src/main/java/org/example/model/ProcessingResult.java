package org.example.model;

public class ProcessingResult {
    private String fileName;
    private int result;

    public ProcessingResult(String fileName, int result) {
        this.fileName = fileName;
        this.result = result;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "ProcessingResult{" +
                "fileName='" + fileName + '\'' +
                ", result=" + result +
                '}';
    }
}
