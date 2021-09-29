package com.example.ques3;

public class Student {
    private int studentID;
    private String studentName;
    private Address studentAddress;

    public Student(int studentID, String studentName, Address studentAddress) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", studentName='" + studentName + '\'' +
                ", studentAddress=" + studentAddress +
                '}';
    }
}
