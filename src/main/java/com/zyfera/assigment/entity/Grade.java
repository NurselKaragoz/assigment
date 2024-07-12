package com.zyfera.assigment.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
public class Grade {
    private int gradeId;
    private String code;
    private int value;

}
