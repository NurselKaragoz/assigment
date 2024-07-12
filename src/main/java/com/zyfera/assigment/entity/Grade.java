package com.zyfera.assigment.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "grade")
public class Grade {
    @JsonIgnore
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int gradeId;
    @Column(name = "code")
    private String code;
    @Column(name = "value")
    private int value;

    //Relations student class
    @JsonIgnore
    @ManyToOne( cascade = {CascadeType.DETACH, CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinColumn(name = "student_id")
    private Student student;

}
