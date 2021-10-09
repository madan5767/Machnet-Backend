package com.internship.ems.dto;

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
    private Employee employee;
}
