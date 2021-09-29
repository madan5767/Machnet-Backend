package com.example.ques4;

public class Address {
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Address{" +
                "address='" + address + '\'' +
                '}';
    }

    public void studentAddress(){
        System.out.println("Address through Autowire is: "+getAddress());
    }
}