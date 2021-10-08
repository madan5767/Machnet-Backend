package com.internship.ems.dto;

import com.internship.ems.enums.Gender;
import com.internship.ems.model.Department;
import com.internship.ems.model.Salary;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Data
public class EmployeeDto {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int employeeID;
    private String firstName;
    private String lastName;
    private Gender gender;
    private int age;
    private String email;
    private String designation;
    private LocalDate hireDate;
    private LocalDate resignedDate;
    private String address;
    private Department department;
    private Salary salary;
}
