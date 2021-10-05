package com.internship.ems.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "user")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @NotEmpty
    @Size(min = 4, message = "Please enter a username")
    @Column(name = "username")
    private String userName;
    @NotEmpty
    @Column(name = "password")
    private String password;
}
