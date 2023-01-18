package controller;

import model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import repo.Repository;

import java.util.List;

@RestController
@CrossOrigin
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

