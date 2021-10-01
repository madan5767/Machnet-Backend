package com.example.ques2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);

        Student ram = context.getBean("student",Student.class);
        Student shyam = context.getBean("student",Student.class);

        if(ram.hashCode()==shyam.hashCode()){
            System.out.println("The hasCode of ram "+ram.hashCode()+" hashCode of shyam "+shyam.hashCode()+" is same");
        }
        else{
            System.out.println("The hasCode of ram "+ram.hashCode()+" hashCode of shyam "+shyam.hashCode()+" is different");
        }
    }
}
