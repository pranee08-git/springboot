package com.example.hello;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api")
public class MedicineController{
       @Autowired
       public MedicineService medicineService;

       @PostMapping("/medicine")
       public Medicine getMe(@RequestBody Medicine medicine)
       {
           return medicineService.saveMedicine(medicine);
       }

       @GetMapping("/medicines")
       public List<Medicine> getMedicine()
       {
           return medicineService.getAll();
       }

       @GetMapping("/medicine/{medicineId}")
       public Medicine getId(@PathVariable("medicineId") int a)
       {
           return medicineService.getMedicine(a);   
       }
}