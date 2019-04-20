package com.dolganova.exception;

public class EmptyIdentifierException extends Exception {

    public static EmptyIdentifierException DEFAULT_INSTANCE =
            new EmptyIdentifierException("Identifier cannot be null or empty");

    public EmptyIdentifierException(String message) {
        super(message);
    }
}
