package com.internship.ems.model;

import com.internship.ems.enums.Gender;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.persistence.PrePersist;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.ZoneId;


@Entity
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

    //Persistence Life Cycle
    @PrePersist
    public void PrePersist(){
        ZoneId defaultZoneId = ZoneId.systemDefault();
        LocalDate localDate = LocalDate.now();
        this.setHireDate(LocalDate.from(localDate.atStartOfDay(defaultZoneId)));
    }
}
