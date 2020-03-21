package com.kata;

import java.io.*;

public class DigitsParser {

    private static final int NUMBER_OF_DIGITS = 9;
    private static final int LINE_LENGTH = 27;

    public String parseRecord(String line1, String line2, String line3) {
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

    public void parseDigitsFile(File fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String line1 = br.readLine();
        while (line1 != null) {
//            line1 = br.readLine();
            String line2 = br.readLine();
            String line3 = br.readLine();
            br.readLine();
            String result = parseRecord(line1, line2, line3);
            System.out.println(result);
        }
    }
}
