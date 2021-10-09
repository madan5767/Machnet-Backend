package com.internship.ems.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.internship.ems.enums.Gender;
import com.internship.ems.listener.EmployeeListener;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;


@Entity
@NoArgsConstructor
@Table(name = "employee", schema = "EMS", uniqueConstraints= {@UniqueConstraint(columnNames={"email"})})
@Data
@EntityListeners(EmployeeListener.class)
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="employee_id")
    private int employeeID;

//    @ColumnDefault("John Snow")
//    private String firstName="John Snow";
//    @Column(insertable=false, updatable = false, nullable = false, columnDefinition = "varchar(255) default 'John Snow'") // by Raskin dai
    @Column(name ="first_name", nullable = false, columnDefinition =  "varchar(255) default 'John Snow'")
    private String firstName="Madan";

    @Column(name ="last_name", nullable = false)
    @NotEmpty(message = "Please enter a last name")
    private String lastName;

    @Column(name ="gender", nullable = false)
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column(name ="age", nullable = false)
    @NotNull
    @Min(18)
    private int age;

    @Column(name ="email", nullable = false)
    @NotEmpty
    @Email
    private String email;

    @Column(name ="designation", nullable = false)
    @NotEmpty(message = "Please enter your designation")
    private String designation;

    @Column(name ="hire_date", nullable = false)
    private LocalDate hireDate;

    @Column(name ="resigned_date")
    private LocalDate resignedDate;

    @Column(name ="address")
    private String address;

    @ManyToOne
    @JoinColumn(name = "departmentId")
    @JsonBackReference(value = "department")
    private Department department;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "salary_id")
    @JsonBackReference(value = "salary")
    private Salary salary;

}

