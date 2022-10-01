package com.example.redditbackend.exceptions;

public class SpringRedditException extends RuntimeException {

    public SpringRedditException(String exMesage) {
        super(exMesage);
    }
}
