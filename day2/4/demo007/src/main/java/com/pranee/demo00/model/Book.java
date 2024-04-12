package com.pranee.demo00.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Book {
     public String title;
     public String author;
     @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "yyyy-MM-dd")
     private Date publicationDate = new Date();
 
     public Book(String title,String author) {
         this.title = title;
         this.author = author;
     }

      
}
