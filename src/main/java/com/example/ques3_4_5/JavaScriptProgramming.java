package com.example.ques3_4_5;

import org.springframework.stereotype.Component;

@Component("javaScript")
public class JavaScriptProgramming implements Programming{
    @Override
    public void programming(){
        System.out.println("Java Script Programming implementing Programming and called the method programming");
    }
}
