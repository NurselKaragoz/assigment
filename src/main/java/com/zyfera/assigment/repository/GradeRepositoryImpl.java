package com.zyfera.assigment.repository;

import com.zyfera.assigment.entity.Grade;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class GradeRepositoryImpl implements GradeRepository{

    EntityManager entityManager;

    // All methods implemented and refactor for return objects

    @Autowired

    public GradeRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    @Transactional
    @Override
    public Grade save(Grade grade) {
        return null;
    }
    @Transactional
    @Override
    public Grade update(Grade grade) {
        return null;
    }
}
