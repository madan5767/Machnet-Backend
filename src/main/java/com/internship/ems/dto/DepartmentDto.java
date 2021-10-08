package com.internship.ems.dto;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
public class DepartmentDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int departmentID;
    private String name;
    private String description;
}
