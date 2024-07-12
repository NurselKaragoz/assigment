package com.zyfera.assigment.validation;

import com.zyfera.assigment.exception.StudentException;
import org.springframework.http.HttpStatus;

public class StudentValidation {

    // To display empty name entry messages for users
    public static void checkName(String name) {
        if (name == null || name.isEmpty()  ) {
            throw new StudentException("Name is null or empty!", HttpStatus.BAD_REQUEST);
        }
    }}

