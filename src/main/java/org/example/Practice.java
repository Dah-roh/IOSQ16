package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Practice {
    public static void main(String[] args) throws IOException {
        String filename = "application.properties";
        Map<String, String> fileValues = new HashMap<>();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(filename))){
           String line;
            while((line=bufferedReader.readLine())!=null){
                String[] lineArray = line.split("=");
                if (lineArray[0].contains("application")){
                    fileValues.put("application", lineArray[1]);
                }
                if(lineArray[0].contains("server")){
                    fileValues.put("port", lineArray[1]);
                }
                if (lineArray[0].contains("db.name")){
                    fileValues.put("dbName", lineArray[1]);
                }
                if (lineArray[0].contains("db.port")){
                    fileValues.put("dbPort", lineArray[1]);
                }
            }
        }catch (Exception e){
            throw new RuntimeException("Failed to read file "+e.getMessage());
        }

        System.out.println(fileValues.get("port"));
        System.out.println(fileValues);
    }
}
//time complexity