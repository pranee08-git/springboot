package com.pranee.demo00.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class Apicontroller {
    @GetMapping("/hello")
    public String rev() {
        return "hello world! ";
    }
    
}
