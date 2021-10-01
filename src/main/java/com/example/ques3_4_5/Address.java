package com.example.ques3_4_5;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
    @Value("${addressID}")
    private int addressID;
    @Value("${addressName}")
    private String addressName;

    public void displayAddress(){
        System.out.println("Address ID: "+addressID+" Address Name:"+addressName);
    }
}
