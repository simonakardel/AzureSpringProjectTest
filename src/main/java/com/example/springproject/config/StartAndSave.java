package com.example.springproject.config;

import com.example.springproject.model.Student;
import com.example.springproject.repo.Repository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartAndSave implements CommandLineRunner {

    Repository studentRepository;

    public StartAndSave(Repository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Student std1 = new Student();
        std1.setName("Annex");
        studentRepository.save(std1);

        Student std2 = new Student();
        std2.setName("Viggo");
        studentRepository.save(std2);

    }
}
