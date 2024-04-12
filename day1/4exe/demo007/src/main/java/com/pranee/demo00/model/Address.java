package com.pranee.demo00.model;
public class Address {
    public String  name;
    public int  doorNo;
    public String  streetName;
    public int pincode;
    public String  area;
    public String  district;
    public String  state;
    public String  country;
    public String getName() {
        return name;
    }
    public Address (int d,String s) {
    this.doorNo=d;
    this.streetName=s;        
    }
}
