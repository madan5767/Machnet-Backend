package com.internship.ems.dto;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
public class ProjectDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int projectID;
    private String name;
    private String description;
}
