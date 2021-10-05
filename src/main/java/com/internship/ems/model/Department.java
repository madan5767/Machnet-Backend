package com.internship.ems.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "department")
@Data
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "department_id")
    private int departmentID;
    @NotEmpty
    @Size(min = 2, message = "Department name should have at least 2 characters")
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
}
