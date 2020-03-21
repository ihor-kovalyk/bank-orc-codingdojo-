package com.kata;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        DigitsParser parser = new DigitsParser();

        DigitsFileReader reader = new DigitsFileReader();
        File file =reader.getFileFromResources("test.txt");
        parser.parseDigitsFile(file);

    }
}
