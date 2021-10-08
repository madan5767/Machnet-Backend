package com.internship.ems.controller;

import com.internship.ems.dto.ProjectDto;
import com.internship.ems.mapper.ProjectMapper;
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
    private ProjectService service;
    @Autowired
    private ProjectMapper projectMapper;

    @GetMapping("/projects")
    public List<ProjectDto> getAllProject(){
        return projectMapper.modelsToDtos(service.getAll());
    }

    @GetMapping("/project/{id}")
    public ProjectDto getProjectById(@PathVariable int id){
        return projectMapper.modelToDto(service.getProjectById(id));
    }

    @PostMapping("/project")
    public ResponseEntity<ProjectDto> createProject(@Valid @RequestBody ProjectDto projectDto) {
        ProjectDto savedProject=projectMapper.modelToDto(service.save(projectMapper.dtoToModel(projectDto)));
        return new ResponseEntity<ProjectDto>(savedProject, HttpStatus.CREATED);
    }

    @PutMapping("/project/{id}")
    public ResponseEntity<ProjectDto> updateProject(@PathVariable int id, @Valid @RequestBody ProjectDto projectInfo) {
        ProjectDto updatedProject=projectMapper.modelToDto(service.updateProject(id,projectMapper.dtoToModel(projectInfo)));
        return new ResponseEntity<ProjectDto>(updatedProject, HttpStatus.CREATED);
    }

    @DeleteMapping("/project/{id}")
    public void removeProject(@PathVariable int id){
        service.deleteProject(id);
    }
}
