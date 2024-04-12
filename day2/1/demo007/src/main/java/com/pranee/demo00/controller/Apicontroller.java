package com.pranee.demo00.controller;

import org.springframework.web.bind.annotation.RestController;

import com.pranee.demo00.ApiConfig.ValueCon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestParam;
@RestController
public class Apicontroller {
    @Autowired
    public ValueCon Config;
   @GetMapping("/info")
   public String getConfig() {
       return "App Name:" + Config.getAppName()+" Version: "+ Config.getAppVersion();
   }
}
