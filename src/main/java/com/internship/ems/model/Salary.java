package com.internship.ems.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.internship.ems.listener.SalaryListener;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@NoArgsConstructor
@Table(name = "salary")
@Data
@EntityListeners(SalaryListener.class)
public class Salary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "salary_id")
    private int salaryID;

    @NotNull
    @Column(name = "issue_date", nullable = false)
    private LocalDate issueDate;

    @NotNull
    @Column(name = "amount", nullable = false)
    private float amount;

    @Column(name="bonus")
    private float bonus;

    @OneToOne(mappedBy = "salary", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonManagedReference(value = "salary")
    private Employee employee;

}
