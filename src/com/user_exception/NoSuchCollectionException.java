package com.user_exception;

/**
 * Created by mapo0104 on 29.3.2017.
 */
public class NoSuchCollectionException extends Exception {
    public NoSuchCollectionException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
