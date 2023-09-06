package com.uwb.clientserver.exceptions;

public class EmailAlreadyExistsException extends RuntimeException {

    public EmailAlreadyExistsException() {
        super("Email is already in use!");
    }

    public EmailAlreadyExistsException(String message) {
        super(message);
    }
}
