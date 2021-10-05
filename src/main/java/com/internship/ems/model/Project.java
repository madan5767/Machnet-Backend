package com.internship.ems.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "project")
@Data
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "project_id")
    private int projectID;
    @NotEmpty
    @Size(min = 2, message = "Project name should have at least 2 characters")
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
}
