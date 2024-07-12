package com.zyfera.assigment.exception;

import org.springframework.http.HttpStatus;

public class GradeException extends RuntimeException{

    //To catch errors
    private HttpStatus httpStatus;
    public GradeException(String message, HttpStatus httpStatus) {
        super(message);
        this.httpStatus = httpStatus;
    }
}
