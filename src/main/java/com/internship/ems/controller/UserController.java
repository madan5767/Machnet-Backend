package com.internship.ems.controller;

import com.internship.ems.model.User;
import com.internship.ems.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
//@Validated
public class UserController {

    @Autowired
    UserService service;

    @GetMapping("/users")
    public List<User> getAllUser(){
        return service.getAll();
    }

    @GetMapping("/users/{id}")
    public User getUserById(@PathVariable Long id){
        return service.getById(id);
    }

    @PostMapping("/users")
    public ResponseEntity<User> createUser(@Valid @RequestBody User user){
        User savedUser = service.save(user);
        return new ResponseEntity<User>(savedUser, HttpStatus.CREATED);
    }

    @PutMapping("/users/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User userinfo) {
        return service.updateUser(id, userinfo);
    }

    @DeleteMapping("/users/{id}")
    public void removeUser(@PathVariable Long id){
        service.deleteUser(id);
    }
}
