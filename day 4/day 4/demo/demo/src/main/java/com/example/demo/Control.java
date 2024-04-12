package com.example.demo;

import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
@RequestMapping("/student")
public class Control {
    private StudentService studentService;

    public Control(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/post")
    public String postMethodName(@RequestBody Student student) {
        studentService.saveStudent(student);
        return "Saved";
    }
    
    @GetMapping("/{id}")
    public Student getob(@PathVariable("id") int id)
    {
        return studentService.get(id);
    }

}
