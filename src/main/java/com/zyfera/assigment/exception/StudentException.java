package com.zyfera.assigment.exception;

import org.springframework.http.HttpStatus;

public class StudentException extends RuntimeException {

    //To catch errors
    private HttpStatus httpStatus;
    public StudentException(String message, HttpStatus httpStatus) {
        super(message);
        this.httpStatus = httpStatus;
    }
}
