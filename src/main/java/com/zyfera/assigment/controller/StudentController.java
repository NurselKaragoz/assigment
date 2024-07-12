package com.zyfera.assigment.controller;

import com.zyfera.assigment.entity.Student;
import com.zyfera.assigment.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;

public class StudentController {

StudentRepository studentRepository;

@Autowired
public StudentController(StudentRepository studentRepository){
    this.studentRepository=studentRepository;

}

public Student save(@RequestBody Student student){
    return studentRepository.save(student);

}}
