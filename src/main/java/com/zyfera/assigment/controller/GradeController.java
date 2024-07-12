package com.zyfera.assigment.controller;

import com.zyfera.assigment.entity.Grade;
import com.zyfera.assigment.repository.GradeRepository;
import com.zyfera.assigment.validation.GradeValidation;
import com.zyfera.assigment.validation.StudentValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GradeController {
    GradeRepository gradeRepository;


  @Autowired
    public GradeController(GradeRepository gradeRepository) {
        this.gradeRepository = gradeRepository;
    }

    // Endpoint for created operation
    @PostMapping("/student/grade")
    public Grade save(@RequestBody Grade grade){
      GradeValidation.checkCode(grade.getCode());
      return gradeRepository.save(grade);

    }
  // Endpoint for updated operation
    @PutMapping("/student/grade")
    public Grade update(@RequestBody Grade grade){
      return gradeRepository.update(grade);
    }
}
