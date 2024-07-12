package com.zyfera.assigment.validation;

import com.zyfera.assigment.exception.StudentException;
import org.springframework.http.HttpStatus;

public class GradeValidation {
    public static void checkCode(String code) {
        if (code == null || code.isEmpty()  ) {
            throw new StudentException("Code is null or empty!", HttpStatus.BAD_REQUEST);
        }
    }
}
