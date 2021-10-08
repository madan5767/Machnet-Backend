package com.internship.ems.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.internship.ems.listener.DepartmentListener;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Entity
@Table(name = "department", schema = "EMS")
@Data
@EntityListeners(DepartmentListener.class)
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "department_id")
    private int departmentID;

    @NotEmpty(message = "Please enter a department name")
    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description")
    private String description;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "department",  fetch = FetchType.LAZY)
    @JsonManagedReference(value = "department")
    private List<Employee> employee;

}
