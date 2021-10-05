package com.internship.ems.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@Table(name = "salary")
@Data
public class Salary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "salary_id")
    private int salaryID;
    @NotNull
    @Column(name = "issue_date")
    private LocalDate issueDate;
    @NotNull
    @Column(name = "amount")
    private float amount;
    @Column(name="bonus")
    private float bonus;
}
