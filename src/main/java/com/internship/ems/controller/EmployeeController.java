package com.internship.ems.controller;

import com.internship.ems.dto.EmployeeDto;
import com.internship.ems.mapper.EmployeeMapper;
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
    private EmployeeService service;
    @Autowired
    private EmployeeMapper employeeMapper;

    @GetMapping("/employees")
    public List<EmployeeDto> getAllEmployee(){
        return employeeMapper.modelsToDtos(service.getAll());
    }

    @GetMapping("/employee/{id}")
    public EmployeeDto getEmployeeById(@PathVariable int id){
        return employeeMapper.modelToDto(service.getEmployeeById(id));
    }

    @PostMapping("/employee")
    public ResponseEntity<EmployeeDto> saveEmployee(@Valid @RequestBody EmployeeDto employeeDto){
        EmployeeDto savedEmployee=employeeMapper.modelToDto(service.save(employeeMapper.dtoToModel(employeeDto)));
        return new ResponseEntity<EmployeeDto>( savedEmployee,HttpStatus.CREATED);
    }

    @PutMapping("/employee/{id}")
    public ResponseEntity<EmployeeDto> updateEmployee(@PathVariable int id,@Valid @RequestBody EmployeeDto employeeInfo) {
        EmployeeDto updatedEmployee=employeeMapper.modelToDto(service.updateEmployee(id,employeeMapper.dtoToModel(employeeInfo)));
        return new ResponseEntity<EmployeeDto>(updatedEmployee,HttpStatus.CREATED);
    }

    @DeleteMapping("/employee/{id}")
    public void removeEmployee(@PathVariable int id){
        service.deleteEmployee(id);
    }
}
