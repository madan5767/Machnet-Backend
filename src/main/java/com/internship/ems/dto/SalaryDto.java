package com.internship.ems.dto;

import com.internship.ems.model.Employee;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Data
public class SalaryDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int salaryID;
    private LocalDate issueDate;
    private float amount;
    private float bonus;
    private Employee employee;
}
