package com.internship.ems.model;

import lombok.Data;
//import org.hibernate.validator.constraints.Email;
//import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.time.LocalDate;

@Entity
@Table(name = "employee")
@Data
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="employee_id")
    private int employeeID;
    @Column(name ="first_name")
    @NotEmpty
    @Size(min = 2, message = "First name should have at least 2 characters")
    private String firstName;
    @Column(name ="last_name")
    @NotEmpty
    @Size(min = 2, message = "First name should have at least 2 characters")
    private String lastName;
    @Column(name ="gender")
    @NotEmpty
    @Size(min = 2, message = "Gender should be revealed")
    private String gender;
    @Column(name ="age")
    @NotNull
    @Min(18)
    private int age;
    @Column(name ="email")
    @NotEmpty
    @Email
    private String email;
    @Column(name ="designation")
    @NotEmpty
    @Size(min = 2, message = "Please provide your designation")
    private String designation;
    @Column(name ="hire_date")
    @NotNull
    private LocalDate hireDate;
    @Column(name ="resigned_date")
    private LocalDate resignedDate;
    @Column(name ="address")
    private String address;
}
