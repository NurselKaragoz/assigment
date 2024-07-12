package com.zyfera.assigment.validation;

import com.zyfera.assigment.exception.StudentException;
import org.springframework.http.HttpStatus;

public class StudentValidation {

    // To display messages fot users
    public static void checkName(String name) {
        if (name == null || name.isEmpty()  ) {
            throw new StudentException("Name is null or empty!", HttpStatus.BAD_REQUEST);
        }
    }}

