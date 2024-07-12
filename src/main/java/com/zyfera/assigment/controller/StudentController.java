package com.zyfera.assigment.controller;

import com.zyfera.assigment.entity.Student;
import com.zyfera.assigment.repository.StudentRepository;
import com.zyfera.assigment.validation.StudentValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class StudentController {

StudentRepository studentRepository;

@Autowired
public StudentController(StudentRepository studentRepository){
    this.studentRepository=studentRepository;

}

//Endpoint for created operation

@PostMapping("/student")
public Student save(@RequestBody Student student){
    StudentValidation.checkName(student.getName());
    return studentRepository.save(student);

}
//Endpoint for updated operation

@PutMapping("/student")
public Student update(@RequestBody Student student){
    return studentRepository.update(student);
}}
