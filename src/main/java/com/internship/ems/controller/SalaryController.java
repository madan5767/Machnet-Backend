package com.internship.ems.controller;

import com.internship.ems.dto.SalaryDto;
import com.internship.ems.mapper.SalaryMapper;
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
    private SalaryService service;
    @Autowired
    private SalaryMapper salaryMapper;

    @GetMapping("/salary")
    public List<SalaryDto> getAllSalary(){
        return salaryMapper.modelsToDtos(service.getAll());
    }

    @GetMapping("/salary/{id}")
    public SalaryDto getSalaryById(@PathVariable int id){
        return salaryMapper.modelToDto(service.getSalaryById(id));
    }

    @PostMapping("/salary")
    public ResponseEntity<SalaryDto> createSalary(@Valid @RequestBody SalaryDto salaryDto) {
        SalaryDto savedSalary=salaryMapper.modelToDto(service.save(salaryMapper.dtoToModel(salaryDto)));
        return new ResponseEntity<SalaryDto>(savedSalary, HttpStatus.CREATED);
    }

    @PutMapping("/salary/{id}")
    public ResponseEntity<SalaryDto> updateSalary(@PathVariable int id, @Valid @RequestBody SalaryDto salaryInfo) {
        SalaryDto updatedSalary=salaryMapper.modelToDto(service.updateSalary(id,salaryMapper.dtoToModel(salaryInfo)));
        return new ResponseEntity<SalaryDto>(updatedSalary, HttpStatus.CREATED);
    }

    @DeleteMapping("/salary/{id}")
    public void removeSalary(@PathVariable int id){
        service.deleteSalary(id);
    }
}
