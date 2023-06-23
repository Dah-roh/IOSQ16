package org.example;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NIOFileReading {
    public static void main(String[] args) {
        //using Path, and Files classes
        String fileName = "ExampleFile.txt";
        String fileInfo;
        try{
            //Provide the file location using the Paths class
            Path filePath = Paths.get(fileName);

            //Read from the file location using the Files.readAllBytes method
            //which return file content in bytes
            byte[] fileData = Files.readAllBytes(filePath);

            //new String() constructor to convert bytes to Sequence of characters
            fileInfo = new String(fileData);
        } catch (Exception e) {
            throw new RuntimeException(" Unable to read file data" + e.getMessage());
        }
        System.out.println(fileInfo);
    }
}
