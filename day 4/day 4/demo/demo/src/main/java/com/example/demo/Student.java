package com.example.demo;


import org.springframework.beans.factory.annotation.Value;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import lombok.Getter;

import lombok.Setter;

@Entity
@Getter
@Setter

public class Student {

    public Student()
    {
        
    }

    public Student(int clgid, String clgName) {
        this.clgid = clgid;
        this.clgName = clgName;
    }

    @Id
    @Value ("1")
    private int clgid;
    @Value ("no college")
    private String clgName;
    public int getClgid() {
        return clgid;
    }
    public void setClgid(int clgid) {
        this.clgid = clgid;
    }
    public String getClgName() {
        return clgName;
    }
    public void setClgName(String clgName) {
        this.clgName = clgName;
    }
 }