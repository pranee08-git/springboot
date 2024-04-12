package com.example.classwork.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/birds")
public class Somecontol {
    @Autowired               
    public ReportService rService;

    @GetMapping("/species/{usrid}")
    public String getMethodName(@PathVariable("usrid")  String pop,@RequestParam("name") String na,@RequestParam("ph") String ph) {
        //return rService.claus(pop);
        return pop+ " " + na + " " + ph;
    }
    
}
