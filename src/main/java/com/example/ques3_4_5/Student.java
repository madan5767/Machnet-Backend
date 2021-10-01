package com.example.ques3_4_5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
    @Value("${studentID}")
    private int studentID;
    @Value("${studentName}")
    private String studentName;
    @Autowired
    private Address address;
    @Autowired
    @Qualifier("javaScriptProgramming")
    private Programming programming;
    @Value("${company}")
    private String company;

    public Student(Address address) {
        address = address;
    }

    public void displayStudent(){
        System.out.println("Student ID: "+studentID+" Student Name: "+studentName);
        address.displayAddress();
        programming.programming();
        System.out.println(company);
    }
}
