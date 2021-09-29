package com.example.ques4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
        Student student=applicationContext.getBean("student",Student.class);
        student.studentAddressAutowire();
        System.out.println(student);
    }
}
