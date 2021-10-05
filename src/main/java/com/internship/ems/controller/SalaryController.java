package com.internship.ems.controller;

import com.internship.ems.model.Salary;
import com.internship.ems.service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class SalaryController {
    @Autowired
    SalaryService service;

    @GetMapping("/salary")
    public List<Salary> getAllSalary(){
        return service.getAll();
    }

    @GetMapping("/salary/{id}")
    public Salary getSalaryById(@PathVariable int id){
        return service.getSalaryById(id);
    }

    @PostMapping("/salary")
    public ResponseEntity<Salary> createSalary(@Valid @RequestBody Salary salary){
        Salary savedSalary = service.save(salary);
        return new ResponseEntity<Salary>(savedSalary, HttpStatus.CREATED);
    }

    @PutMapping("/salary/{id}")
    public Salary updateSalary(@PathVariable int id, @RequestBody Salary salaryinfo) {
        return service.updateSalary(id, salaryinfo);
    }

    @DeleteMapping("/salary/{id}")
    public void removeSalary(@PathVariable int id){
        service.deleteSalary(id);
    }
}
