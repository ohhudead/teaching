package org.example.dto;

public class WrongInputException extends RuntimeException {
    public WrongInputException(String message) {
        super(message);
    }

    public WrongInputException() {
    }
}
