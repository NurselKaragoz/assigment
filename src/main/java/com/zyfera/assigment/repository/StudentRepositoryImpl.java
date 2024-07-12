package com.zyfera.assigment.repository;

import com.zyfera.assigment.entity.Student;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class StudentRepositoryImpl implements StudentRepository{

    EntityManager entityManager;

    @Autowired

    public StudentRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Transactional
    @Override
    public Student save(Student student) {
         entityManager.persist(student);
        return student;
    }
    @Transactional
    @Override
    public Student update(Student student) {
        entityManager.merge(student);
        return student;
    }
}
