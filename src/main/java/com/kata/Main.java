package com.kata;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
    PipeLineDigit digit = new PipeLineDigit();
    digit.getDigit(input);
    }
}
