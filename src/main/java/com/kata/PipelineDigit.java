package java.com.kata;

public enum PipelineDigit {
    ZERO(" _ "+
            "| |"+
            "|_|"),

    ONE( "   "+
            "  |"+
            "  |"),

    TWO( " _ "+
            " _|"+
            "|_ "),

    THREE(" _ "+
             " _|"+
             " _|"),

    FOUR("   " +
            "|_|" +
            "  |"),

    FIVE(" _ "+
            "|_ "+
            " _|"),

    SIX( " _ "+
            "|_ "+
            "|_|"),

    SEVEN(" _ "+
             "  |"+
             "  |"),

    EIGHT(" _ "+
             "|_|"+
             "|_|"),

    NINE( " _ "+
             "|_|"+
             " _|");

    PipelineDigit(String s) {

    }
}
