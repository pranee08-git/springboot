package com.pranee.demo00.controller;

import org.springframework.web.bind.annotation.RestController;
// import org.yaml.snakeyaml.tokens.BlockEndToken;

import com.pranee.demo00.model.Book;

import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class BookController {
   @GetMapping("/book")
   public Book getMethodName() {
       return new Book("the wall","praneeth");
   }
   
   
}
