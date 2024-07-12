package com.zyfera.assigment.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor(force = true)

@Data
@Entity
@Table(name = "student")
public class Student {
    @JsonIgnore
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private  int id;
    @Column(name="name")
    private String name;
    @Column(name="surname")
    private String surname;

    // Student number can not change due to final
    @Column(name="stdNumber")
    private final String stdNumber;
   //Relations grade class
    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    private List<Grade> grades = new ArrayList<>();
}

