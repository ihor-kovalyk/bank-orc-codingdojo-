package com.kata;

public enum Digits {
    ZERO (  " _\n " +
            "| |\n" +
            "|_|\n", "0"),
    ONE (   "   \n" +
            "  |\n" +
            "  |\n", "1"),
    TWO (   " _ \n" +
            " _|\n" +
            "|_ \n", "2"),
    THREE ( " _\n " +
            " _|\n" +
            " _|\n", "3"),
    FOUR (  "   \n" +
            "|_|\n" +
            "  |\n", "4"),
    FIVE (  "  _\n " +
            "|_\n " +
            " _|\n", "5"),
    SIX (   " _ \n" +
            "|_ \n" +
            "|_|\n6", "6"),
    SEVEN ( " _ \n" +
            "  |\n" +
            "  |\n", "7"),
    EIGHT ( " _\n " +
            "|_|\n" +
            "|_|\n", "8"),
    NINE (  " _ \n" +
            "|_|\n" +
            " _|\n", "9"),;


    private final String value;
    private final String number;

    Digits(String value, String number) {
        this.value = value;
        this.number = number;
    }

    public String number() {
        return number;
    }

    public static String get(String input){
        for (Digits digit: values()) {
            if (input.equals(digit.number)) {
                return digit.value;
            }
        }
        throw new IllegalArgumentException("Unknown input with \''" + input + "\'' value");
    }

    //TODO: check if enum map is applicable here
}
