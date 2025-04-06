package com.luv2code.demo.rest;

public class CustomExceptionClass extends RuntimeException{

    public CustomExceptionClass(String message) {
        super(message);
    }

    public CustomExceptionClass(String message, Throwable cause) {
        super(message, cause);
    }

    public CustomExceptionClass(Throwable cause) {
        super(cause);
    }

}
