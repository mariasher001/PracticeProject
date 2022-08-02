package com.practice.Exceptions;

public class InvalidNumberException extends Exception {
    public InvalidNumberException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidNumberException() {

    }
}
