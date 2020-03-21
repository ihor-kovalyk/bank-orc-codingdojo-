package com.kata;

import java.util.HashMap;
import java.util.Map;

public class PipeLineDigits {
    public static final String ZERO =
            " _ \n" +
                    "| |\n" +
                    "|_|\n";

    public static final String ONE =
            "   \n" +
                    "  |\n" +
                    "  |\n";
    public static final String TWO =
            " _ \n" +
                    " _|\n" +
                    "|_ \n";
    public static final String THREE =
            " _\n " +
                    " _|\n" +
                    " _|\n";
    public static final String FOUR =
            "   \n" +
                    "|_|\n" +
                    "  |\n";
    public static final String FIVE =
            " _\n " +
                    "|_\n " +
                    " _|\n";
    public static final String SIX =
            " _ \n" +
                    "|_ \n" +
                    "|_|\n";
    public static final String SEVEN =
            " _ \n" +
                    "  |\n" +
                    "  |\n";
    public static final String EIGHT =
            " _\n " +
                    "|_|\n" +
                    "|_|\n";
    public static final String NINE =
            " _ \n" +
                    "|_|\n" +
                    " _|\n";

    public Map<String, Integer> digits;

    public void getDigit(String s) {
        int i = 0;
        digits = new HashMap<>();
        digits.put(ZERO, 0);
        digits.put(ONE, 1);
        digits.put(TWO, 2);
        digits.put(THREE, 3);
        digits.put(FOUR, 4);
        digits.put(FIVE, 5);
        digits.put(SIX, 6);
        digits.put(SEVEN, 7);
        digits.put(EIGHT, 8);
        digits.put(NINE, 9);
        digits.forEach((key,value) -> {
            System.out.println(value);});
    }
}