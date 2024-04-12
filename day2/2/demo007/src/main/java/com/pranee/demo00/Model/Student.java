package com.pranee.demo00.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Student {
   @JsonProperty("Student name: ")
   private String name;
   @JsonProperty("Student Age: ")
   private int age;
   public Student(String a,int b)
   {
    this.name=a;
    this.age=b;
   }

}
