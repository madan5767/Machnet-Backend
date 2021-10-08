package com.internship.ems.dto;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.internship.ems.enums.Gender;
import com.internship.ems.model.Department;
import com.internship.ems.model.Salary;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Data
public class EmployeeDto {
    private int employeeID;
    @NotEmpty(message = "Please enter a first name")
    private String firstName;
    @NotEmpty(message = "Please enter a last name")
    private String lastName;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    @NotNull(message = "Please enter your age")
    @Min(18)
    private int age;
    @NotEmpty(message = "Please enter a email")
    @Email
    private String email;
    @NotEmpty(message = "Please enter your designation")
    private String designation;
    @NotNull(message = "Please Enter a Hire Date")
    private LocalDate hireDate;
    private LocalDate resignedDate;
    private String address;
    @JsonBackReference(value = "department")
    private Department department;
    @JsonBackReference(value = "salary")
    private Salary salary;
}
