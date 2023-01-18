package com.example.springproject.repo;

import com.example.springproject.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Student, Integer> {

}
