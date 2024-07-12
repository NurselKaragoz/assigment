package com.zyfera.assigment.repository;

import com.zyfera.assigment.entity.Grade;

public interface GradeRepository {
    Grade save(Grade grade);
    Grade update(Grade grade);
}
