package com.example.ques3_4_5;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.example.ques3_4_5")
@PropertySource("classpath:application.properties")
public class StdConfig {
}
