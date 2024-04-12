package com.pranee.demo00.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
@RestController
public class Apicontroller {
   @GetMapping("/StudentName")
   public String rev(@RequestParam("sname") String q,
                    @RequestParam("sroll") String p,
                    @RequestParam("ssec") String r) 
   {
       return "Welcome "+ q + "!"+" roll "+ p + " section "+  r;
   }
   
   
    
}
