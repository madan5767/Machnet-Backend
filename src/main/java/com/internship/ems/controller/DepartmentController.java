package com.internship.ems.controller;

import com.internship.ems.dto.DepartmentDto;
import com.internship.ems.mapper.DepartmentMapper;
import com.internship.ems.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService service;
    @Autowired
    private DepartmentMapper departmentMapper;

    @GetMapping("/department")
    public List<DepartmentDto> getAllDepartment() {
        return departmentMapper.modelsToDtos(service.getAll());
    }

    @GetMapping("/department/{id}")
    public DepartmentDto getDepartmentById(@PathVariable int id) {
        return departmentMapper.modelToDto(service.getDepartmentById(id));
    }

    @PostMapping("/department")
    public ResponseEntity<DepartmentDto> createDepartment(@Valid @RequestBody DepartmentDto departmentDto) {
        DepartmentDto savedDepartment=departmentMapper.modelToDto(service.save(departmentMapper.dtoToModel(departmentDto)));
        return new ResponseEntity<DepartmentDto>(savedDepartment, HttpStatus.CREATED);
    }

    @PutMapping("/department/{id}")
    public ResponseEntity<DepartmentDto> updateDepartment(@PathVariable int id, @Valid @RequestBody DepartmentDto departmentInfo) {
        DepartmentDto updatedDepartment=departmentMapper.modelToDto(service.updateDepartment(id,departmentMapper.dtoToModel(departmentInfo)));
        return new ResponseEntity<DepartmentDto>(updatedDepartment, HttpStatus.CREATED);
    }

    @DeleteMapping("/departments/{id}")
    public void removeDepartment(@PathVariable int id) {
        service.deleteDepartment(id);
    }
}
