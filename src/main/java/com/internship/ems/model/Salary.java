package com.internship.ems.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@NoArgsConstructor
@Table(name = "salary")
@Data
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

//    @OneToOne
//    @JoinColumn(name = "employee_id")
//    private Employee employee;

//    @OneToOne(mappedBy = "salary")
//    private Employee employee;

    @OneToOne(mappedBy = "salary", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonManagedReference
    private Employee employee;

    //Persistence Life Cycle
    @PreRemove
    public void PreRemove(){
        System.out.println("Entity "+this+" will be removed.");
    }

    @PostRemove
    public void PostRemove(){
        System.out.println("Entity "+this+" was removed.");
    }
}
