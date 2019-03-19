package com.dolganova.exception;

import javax.xml.ws.WebFault;

@WebFault(faultBean = "com.dolganova.exception.NonKeySpecifiedExceptionBean")
public class NonKeySpecifiedException extends Exception {
    private final NonKeySpecifiedExceptionBean fault;

    public NonKeySpecifiedException(String message, NonKeySpecifiedExceptionBean fault) {
        super(message);
        this.fault = fault;
    }

    public NonKeySpecifiedException(String message, NonKeySpecifiedExceptionBean fault, Throwable cause) {
        super(message, cause);
        this.fault = fault;
    }

    public NonKeySpecifiedExceptionBean getFaultInfo() {
        return fault;
    }
}
