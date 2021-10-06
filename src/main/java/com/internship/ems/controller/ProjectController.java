package com.internship.ems.controller;


import com.internship.ems.model.Project;
import com.internship.ems.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class ProjectController {
    @Autowired
    ProjectService service;

    @GetMapping("/projects")
    public List<Project> getAllProject(){
        return service.getAll();
    }

    @GetMapping("/project/{id}")
    public Project getProjectById(@PathVariable int id){
        return service.getProjectById(id);
    }

    @PostMapping("/project")
    public ResponseEntity<Project> createProject(@Valid @RequestBody Project project){
        Project savedProject = service.save(project);
        return new ResponseEntity<Project>(savedProject, HttpStatus.CREATED);
    }

    @PutMapping("/project/{id}")
    public Project updateProject(@PathVariable int id, @RequestBody Project projectinfo) {
        return service.updateProject(id, projectinfo);
    }

    @DeleteMapping("/project/{id}")
    public void removeProject(@PathVariable int id){
        service.deleteProject(id);
    }
}
