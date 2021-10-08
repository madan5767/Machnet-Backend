package com.internship.ems.controller;

import com.internship.ems.model.Department;
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
    DepartmentService service;

    @GetMapping("/departments")
    public List<Department> getAllDepartment(){
        return service.getAll();
    }

    @GetMapping("/department/{id}")
    public Department getDepartmentById(@PathVariable int id){
        return service.getDepartmentById(id);
    }

    @PostMapping("/department")
    public ResponseEntity<Department> createDepartment(@Valid @RequestBody Department department){
        Department savedDepartment = service.save(department);
        return new ResponseEntity<Department>(savedDepartment, HttpStatus.CREATED);
    }

    @PutMapping("/department/{id}")
    public Department updateDepartment(@PathVariable int id, @RequestBody Department departmentinfo) {
        return service.updateDepartment(id, departmentinfo);
    }

    @DeleteMapping("/department/{id}")
    public void removeDepartment(@PathVariable int id){
        service.deleteDepartment(id);
    }
}
