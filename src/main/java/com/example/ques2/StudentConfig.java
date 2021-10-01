package com.example.ques2;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example.ques2")
public class StudentConfig {

    public Student student(){
        return new Student();
    }

}