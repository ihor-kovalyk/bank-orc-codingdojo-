package com.kata;

import java.io.*;
import java.net.URL;

public class DigitsFileReader {

    public File getFileFromResources(String fileName) throws FileNotFoundException {

        ClassLoader classLoader = getClass().getClassLoader();

        URL resource = classLoader.getResource(fileName);
        if (resource == null) {
            throw new FileNotFoundException("file is not found!");
        } else {
            return new File(resource.getFile());
        }
    }

    public void printFile(File file) throws IOException {
        if (file == null) return;

        try (FileReader reader = new FileReader(file);
             BufferedReader br = new BufferedReader(reader)) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
}
