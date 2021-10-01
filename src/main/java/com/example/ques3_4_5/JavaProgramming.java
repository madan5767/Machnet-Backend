package com.example.ques3_4_5;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class JavaProgramming implements Programming{
    @Override
    public void programming(){
        System.out.println("an interface call Programming with method programming and implement it in Java Programming");
    }
}
