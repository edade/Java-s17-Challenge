package com.workintech.s17challenge.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Course {
    private Integer id;
    private String name;
    private  int credit;
    private Grade grade;
}
