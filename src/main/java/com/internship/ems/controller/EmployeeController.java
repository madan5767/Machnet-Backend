package com.internship.ems.controller;

import com.internship.ems.model.Employee;
import com.internship.ems.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService service;

    @GetMapping("/employees")
    public List<Employee> getAllEmployee(){
        return service.getAll();
    }

    @GetMapping("/employee/{id}")
    public Employee getEmployeeById(@PathVariable int id){
        return service.getEmployeeById(id);
    }

    @PostMapping("/employee")
    public ResponseEntity<Employee> createEmployee(@Valid @RequestBody Employee employee){
        Employee savedEmployee = service.save(employee);
        return new ResponseEntity<Employee>(savedEmployee, HttpStatus.CREATED);
    }

//    public ResponseEntity saveUser(User user) {
//        try {
//            String encodedPassword = encoder.encode(user.getPassword());
//            user.setPassword(encodedPassword);
//
//            if (userRepository.existsByUsername(user.getUsername())) {
//
//                return ResponseEntity.badRequest().body("Username is already Taken!");
//            }
//
//            if (userRepository.existsByEmail(user.getEmail())) {
//
//                return ResponseEntity.badRequest().body("Email is already Taken!");
//            }
//
//            userRepository.save(user);
//
//            return ResponseEntity.ok(user.getFirstname() + " Registered Successfully");
//        } catch (Exception e) {
//            return ResponseEntity.internalServerError().body("Internal Server Error: " + e);
//        }
//    }

    @PutMapping("/employee/{id}")
    public Employee updateEmployee(@PathVariable int id, @RequestBody Employee employeeinfo) {
        return service.updateEmployee(id, employeeinfo);
    }

    @DeleteMapping("/employee/{id}")
    public void removeEmployee(@PathVariable int id){
        service.deleteEmployee(id);
    }
}
