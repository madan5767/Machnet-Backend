package com.example.ques1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(CalculatorConfig.class);

        Calculator calc = context.getBean("calculator", Calculator.class);
        System.out.println("Sum of number is: "+calc.add(7,10));
        System.out.println("Difference of number is: "+calc.sub(10,7));
        System.out.println("Multiplication of number is: "+calc.multiply(10,10));
        System.out.println("Sum of number is: "+calc.divide(100,9));
    }
}
