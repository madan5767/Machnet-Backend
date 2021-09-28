package com.assignment4;

public class BadRequestException extends Exception {
    String message;
    int status;

    public BadRequestException(int status, String errorMessage) {
        super(errorMessage);
        this.message = errorMessage;
        this.status = status;
    }
}
