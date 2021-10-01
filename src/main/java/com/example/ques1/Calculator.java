package com.example.ques1;

//@Component("calculatorBean") //creating bean using @component method.
public class Calculator {

    private int num1, num2;

    public int add(int num1, int num2){
        return num1+num2;
    }

    public int sub(int num1, int num2){
        return num1-num2;
    }

    public int multiply(int num1, int num2){
        return num1*num2;
    }

    public float divide(int num1, int num2){
        return num1/num2;
    }
}
