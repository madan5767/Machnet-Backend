package com.internship.ems.dto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class ProjectDto {
    private int projectID;
    @NotEmpty(message = "Please enter a project name")
    private String name;
    private String description;

}
