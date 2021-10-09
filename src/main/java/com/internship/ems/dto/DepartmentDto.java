package com.internship.ems.dto;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.internship.ems.model.Employee;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.util.List;

@Data
public class DepartmentDto {
    private int departmentID;
    @NotEmpty(message = "Please enter a department name")
    private String name;
    private String description;
    private List<Employee> employee;
}
