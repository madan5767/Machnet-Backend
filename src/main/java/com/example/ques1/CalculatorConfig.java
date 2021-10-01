package com.example.ques1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.example.ques1") // not necessary while using @Bean.
public class CalculatorConfig {

//    @Bean(name="addBean") //defining own custom bean name/id
//    @Bean
//    public Calculator calculatorBean() // method name will be bean id.
//    {
//        return new Calculator();
//    }

    @Bean
    public Calculator calculator(){
        return new Calculator();
    }

}
