package com.example.demo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="/api/v1/students")
public class StudentController {
    @GetMapping
    public List<Student> getAllStudents(){

       return List.of(
                new Student(1L, "name", "email@email.com", Gender.FEMALE),
                new Student(2L, "name2", "email2@email.com", Gender.MALE));

    }
}
