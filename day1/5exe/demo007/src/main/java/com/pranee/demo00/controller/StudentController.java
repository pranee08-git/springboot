package com.pranee.demo00.controller;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class StudentController {
  @GetMapping("/student")
  public List<String> rev() {
      List<String>l=new ArrayList<>();
      l.add(new Student("John","Welcome, John!"));
      return l;
  }
  
    
    
}
