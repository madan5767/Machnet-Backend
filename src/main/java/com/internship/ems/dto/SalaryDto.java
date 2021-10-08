package com.internship.ems.dto;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.internship.ems.model.Employee;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Data
public class SalaryDto {
    private int salaryID;
    @NotNull
    private LocalDate issueDate;
    @NotNull
    private float amount;
    private float bonus;
    @JsonManagedReference(value = "salary")
    private Employee employee;
}
