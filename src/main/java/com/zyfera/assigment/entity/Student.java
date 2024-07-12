package com.zyfera.assigment.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@Entity
public class Student {

    private int studentId;
    private String name;
    private String surname;
    private final String stdNumber;


}
