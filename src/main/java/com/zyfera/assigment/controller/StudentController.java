package com.zyfera.assigment.controller;

import com.zyfera.assigment.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class StudentController {

StudentRepository studentRepository;

@Autowired
public StudentController(StudentRepository studentRepository){
    this.studentRepository=studentRepository;

}
}
