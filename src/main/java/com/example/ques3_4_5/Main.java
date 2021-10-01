package com.example.ques3_4_5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(StdConfig.class);

        Student std = context.getBean(Student.class);
        std.displayStudent();
    }
}
