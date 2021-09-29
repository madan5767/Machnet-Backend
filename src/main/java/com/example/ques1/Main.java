package com.example.ques1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student1 = context.getBean("Nischal", Student.class);
        Student student2 = context.getBean("Madan", Student.class);
        System.out.println(student1);
        System.out.println(student2);
    }
}
