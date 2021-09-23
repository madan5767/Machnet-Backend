package com.assignment2;
import java.util.stream.Collectors;
import java.util.List;
import java.util.ArrayList;


class Students{
    String name;
    int semester;
    int age;
    String gender;

    public Students(String name, int semester, int age, String gender) {
        this.name = name;
        this.semester = semester;
        this.age = age;
        this.gender = gender;
    }
}

public class StudentDetails {
    List<Students> studentList = new ArrayList<>();

    public StudentDetails(){
        //Adding Students details to Array
        studentList.add(new Students("Madan",4,23,"Male"));
        studentList.add(new Students("Summit",4,25,"Male"));
        studentList.add(new Students("Nischal",7,22,"Male"));
        studentList.add(new Students("Ajay",8,25,"Male"));
        studentList.add(new Students("jom",3,30,"Male"));
        studentList.add(new Students("Jonny",3,30,"Male"));
    }

    public void DisplayStudentName(){
        List<String> studentNames = studentList.stream()
                .map(name->name.name)
                .collect(Collectors.toList());
        System.out.println("Student Names are: "+studentNames);
    }

    public void FilterStudentName(){
        List <Students> studentFilter = studentList.stream()
                .filter(e -> (e.name.startsWith("J") && e.semester == 3) ||(e.name.startsWith("j") && e.semester == 3))
                .collect(Collectors.toList());

        System.out.println("Name of student whose name starts with J or j and Sem=3: ");
        for(Students student : studentFilter){
            System.out.println(student.name);
        }
    }

    public static void main(String[] args) {
        //Question 2. Displaying student name
        StudentDetails student = new StudentDetails();
        student.DisplayStudentName();
        //Question no.3
        student.FilterStudentName();
    }
}
