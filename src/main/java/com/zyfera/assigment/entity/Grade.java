package com.zyfera.assigment.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
public class Grade {
    @Id
    private int gradeId;
    private String code;
    private int value;

}
