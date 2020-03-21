package com.kata;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        // pass the path to the file as a parameter
        FileReader fr =
                new FileReader("bank-orc-codingdojo-/src/main/resources/digits.txt");

        int i;
        while ((i=fr.read()) != -1)
            System.out.print((char) i);
    }
}
