package com.assignment2;

import java.util.*;
import java.util.stream.Collectors;

class Employee
{
    String name;
    int age;
    String gender;
    String department;
    double salary;

    public Employee(String name, int age, String gender, String department, double salary)
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.salary = salary;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public String getGender()
    {
        return gender;
    }

    public String getDepartment()
    {
        return department;
    }

    public double getSalary()
    {
        return salary;
    }

    @Override
    public String toString()
    {
        return " Name : "+name
                +", age : "+age
                +", Gender : "+gender
                +", Department : "+department
                +", Salary : "+salary;
    }
}

class employeeList{

    public static void main(String[] args){
        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(new Employee("Madan", 23, "Male", "Developer", 23500.0));
        employeeList.add(new Employee("Ajay", 24, "Male", "Sales And Marketing",  23500.0));
        employeeList.add(new Employee("Nischal", 22, "Male", "Developer",  18000.0));
        employeeList.add(new Employee("Dharma", 23, "Male", "Sales And Marketing",  32500.0));
        employeeList.add(new Employee("Summit", 22, "Male", "HR",  22700.0));
        employeeList.add(new Employee("Kushang", 24, "Male", "QA", 10500.0));
        employeeList.add(new Employee("Aishwarya", 24, "Female", "QA", 35000.0));
        employeeList.add(new Employee("Chorten", 24, "Female", "Developer",  35500.0));

//        A no. Solution
        DoubleSummaryStatistics employeeAverageSalary=
                employeeList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
        System.out.println("The Average Salary of Employee is: "+employeeAverageSalary.getAverage());


//        B no. Solution
        System.out.println("List of all the unique department is: ");
        employeeList.stream()
                .map(Employee::getDepartment)
                .distinct()
                .forEach(System.out::println);

//        C No. Solution
        Map<String, Double> avgSalaryOfDepartments=
                employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));

        Set<Map.Entry<String, Double>> entrySet = avgSalaryOfDepartments.entrySet();

        System.out.println("The average salary of each of the department is: ");
        for (Map.Entry<String, Double> entry : entrySet)
        {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

    }
}
