package com.example.ques4;

public class Student {
    private int studentId;
    private String studentName;
    private Address address;

    public Student() {
        System.out.println("default Constructor");
    }

    public Student(Address address) {
        this.address = address;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", address=" + address +
                '}';
    }

    public void studentAddressAutowire(){
        address.studentAddress();
    }
}