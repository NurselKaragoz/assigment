package com.zyfera.assigment.exception;

import org.springframework.http.HttpStatus;

public class GradeException extends RuntimeException{
    private HttpStatus httpStatus;
    public GradeException(String message, HttpStatus httpStatus) {
        super(message);
        this.httpStatus = httpStatus;
    }
}
