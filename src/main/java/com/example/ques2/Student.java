package com.example.ques2;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")  //if we prototype different object are instantiated.
public class Student {

    public Student(){
        System.out.println("Object Created");
    }

}
