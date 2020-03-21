package com.kata;

public class DigitsParser {

    private static final int NUMBER_OF_DIGITS = 9;
    private static final int LINE_LENGTH = 27;

    static String parseRecord(String line1, String line2, String line3) {
        StringBuilder result = new StringBuilder(NUMBER_OF_DIGITS);
        int startIndex;

        if (line1.length() != LINE_LENGTH || line2.length() != LINE_LENGTH || line3.length() != LINE_LENGTH)
            throw new IllegalArgumentException("line length is not 27 characters");

        for (int i = 0; i < NUMBER_OF_DIGITS; i++) {
            StringBuilder number = new StringBuilder(9);
            startIndex = i * 3;

            number.append(line1.substring(startIndex, startIndex + 3));
            number.append(line2.substring(startIndex, startIndex + 3));
            number.append(line3.substring(startIndex, startIndex + 3));

        }
        return result.toString();
    }


}
