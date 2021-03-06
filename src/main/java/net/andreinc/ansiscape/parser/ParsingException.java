package net.andreinc.ansiscape.parser;

public class ParsingException extends RuntimeException {

    public static final ParsingException unknownEscapeClass(String className) {
        return new ParsingException(String.format("Unknown escape class: '%s'.", className));
    }

    public static final ParsingException invalidBracketSerquence(int index) {
        return new ParsingException(String.format("Invalid bracket sequence detected at index: %d.", index));
    }

    public static final ParsingException invalidSource() {
        return new ParsingException("Invalid source. String cannot be NULL or empty.");
    }

    public ParsingException(String msg) {
        super(msg);
    }
}
