package com.example.springproject.controller;

import com.example.springproject.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.springproject.repo.Repository;

import java.util.List;

@RestController
@CrossOrigin(value = "*")
public class Controller {

    @Autowired Repository repository;

    @GetMapping("/test")
    public Student kurt() {
        Student std = new Student();
        std.setName("test");
        return std;
    }

    @GetMapping("/")
    public List<Student> students() {
        return repository.findAll();
    }


}

