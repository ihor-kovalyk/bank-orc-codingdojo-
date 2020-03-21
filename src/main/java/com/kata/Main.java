package com.kata;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // pass the path to the file as a parameter
//        FileReader fr =
//                new FileReader("bank-orc-codingdojo-/src/main/resources/digits.txt");
//
//        int i;
//        while ((i=fr.read()) != -1)
//            System.out.print((char) i);
        DigitsFileReader reader = new DigitsFileReader();
        File file =reader.getFileFromResources("digits.txt");
        reader.printFile(file);
    }
}
