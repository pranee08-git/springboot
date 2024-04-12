package com.pranee.demo00.controller;

import org.springframework.web.bind.annotation.RestController;

import com.pranee.demo00.model.Address;

import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class AddressController {
  @GetMapping("/address")
  public Address rev() {
      return new Address(123,"Main st");
  }
  
    
    
}
