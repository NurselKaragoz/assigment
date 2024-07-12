package com.zyfera.assigment.repository;

import com.zyfera.assigment.entity.Student;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public class StudentRepositoryImpl implements StudentRepository{

    EntityManager entityManager;

    @Autowired

    public StudentRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Transactional
    @Override
    public Student save(Student student) {
        return null;
    }
    @Transactional
    @Override
    public Student update(Student student) {
        return null;
    }
}
