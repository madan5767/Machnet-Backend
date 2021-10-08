package com.internship.ems.controller;

import com.internship.ems.dto.EmployeeDto;
import com.internship.ems.mapper.EmployeeMapper;
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
//    @Autowired
//    EmployeeMapper mapper;

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

//    @PostMapping("/employee")
//    public ResponseEntity<Employee> createEmployee(@Valid @RequestBody EmployeeDto employeeDto){
//        Employee savedEmployee = service.save(mapper.dtoToModel(employeeDto));
//        return new ResponseEntity<Employee>(savedEmployee, HttpStatus.CREATED);
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
