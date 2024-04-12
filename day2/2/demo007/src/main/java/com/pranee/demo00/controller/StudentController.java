package com.pranee.demo00.controller;

import org.springframework.web.bind.annotation.RestController;

import com.pranee.demo00.Model.Student;

import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class StudentController {
  @GetMapping("/Student")
  public Student rev() {
      return new Student("Nitish",20);
  }
  
}
