package com.internship.ems.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.internship.ems.enums.Gender;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.ZoneId;


@Entity
@NoArgsConstructor
@Table(name = "employee", schema = "EMS", uniqueConstraints= {@UniqueConstraint(columnNames={"email"})})
@Data
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="employee_id")
    private int employeeID;

//    @ColumnDefault("John Snow")
//    @Column(name ="first_name", nullable = false, columnDefinition =  "varchar(255) default 'John Snow'")
//    @NotEmpty(message = "Please enter a first name")
//    private String firstName="John Snow";
    @Column(insertable=false, updatable = false, nullable = false, columnDefinition = "varchar(255) default 'John Snow'")
    private String firstName;

    @Column(name ="last_name", nullable = false)
    @NotEmpty(message = "Please enter a last name")
    private String lastName;

    @Column(name ="gender", nullable = false)
//    @NotEmpty(message = "please enter your gender")
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

//    @JsonBackReference
//    public Department getDepartment(){
//        return department;
//    }

//    @OneToOne(mappedBy = "employee", cascade = CascadeType.ALL)
//    private Salary salary;

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "salary_id", referencedColumnName = "employee_id")
//    private Salary salary;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "salary_id")
    @JsonBackReference(value = "salary")
    private Salary salary;

//    @JsonBackReference
//    public Salary getSalary(){
//        return salary;
//    }

    //Persistence Life Cycle
    @PrePersist
    public void PrePersist(){
        ZoneId defaultZoneId = ZoneId.systemDefault();
        LocalDate localDate = LocalDate.now();
        this.setHireDate(LocalDate.from(localDate.atStartOfDay(defaultZoneId)));
    }
}

