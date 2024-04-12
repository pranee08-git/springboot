package com.pranee.demo00.model;

import org.springframework.stereotype.Service;


public class Student {
    public String  StudentName,message;
    public Student(String a,String b)
    {
        this.StudentName=a;
        this.message=b;
    }
}
