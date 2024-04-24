package com.example.Donation_Centre.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.Donation_Centre.model.Blood;
import com.example.Donation_Centre.model.Eye;
import com.example.Donation_Centre.service.DonationService;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestParam;


@RestController
// @RequestMapping("/api")
public class DonationController {

    @Autowired
    private DonationService donationService;

    // Eye operations
    @GetMapping("/eye")
    public List<Eye> geteye() {
        return donationService.geteye();
    }

    @GetMapping("/eye/{id}")
    public Eye geteye(@PathVariable Long id) {
        return donationService.geteye(id);
    }

    @PostMapping("/eye")
    public Eye saveeye(@RequestBody Eye eye) {
        return donationService.saveeye(eye);
    }

    @PutMapping("/eye/{id}")
    public String updateeye(@PathVariable Long id, @RequestBody Eye updatedEye) {
        Eye existingEye = donationService.geteye(id);
        if (existingEye != null) {
            existingEye.setAddress(updatedEye.getAddress());
            existingEye.setAge(updatedEye.getAge());
            existingEye.setInfection(updatedEye.getInfection());
            existingEye.setGender(updatedEye.getGender());
            existingEye.setDonar_id(updatedEye.getDonar_id());
            existingEye.setDonor_name(updatedEye.getDonor_name());
            donationService.saveeye(existingEye);
            return "eye Updated (excluding eye name)";
        } else {
            return "No Data Found";
        }
    }

    @DeleteMapping("/eye/{id}")
    public String deleteeye(@PathVariable Long id) {
        Eye existingEye = donationService.geteye(id);
        if (existingEye != null) {
            donationService.deleteeye(id);
            return "Deleted";
        } else {
            return "No Data Found";
        }
    }

    // Blood operations
    @GetMapping("/blood")
    public List<Blood> getblood() {
        return donationService.getblood();
    }

    @GetMapping("/blood/{id}")
    public Blood getblood(@PathVariable Long id) {
        return donationService.getblood(id);
    }

    @PostMapping("/blood")
    public Blood saveBasecamp(@RequestBody Blood Blood) {
        return donationService.saveblood(Blood);
    }

    @PutMapping("/blood/{id}")
    public String updateblood(@PathVariable Long id, @RequestBody Blood updatedBlood) {
        Blood existingBlood = donationService.getblood(id);
        if (existingBlood != null) {
            existingBlood.setAge(updatedBlood.getAge());
            existingBlood.setAddress(updatedBlood.getAddress());
            existingBlood.setDonor_name(updatedBlood.getDonor_name());
            existingBlood.setDonor_id(updatedBlood.getDonor_id());
            existingBlood.setUnit(updatedBlood.getUnit());
            existingBlood.setBlood_group(updatedBlood.getBlood_group());
            donationService.saveblood(existingBlood);
            return "Blood Updated (excluding name and terrain)";
        } else {
            return "Blood not available";
        }
    }

    @DeleteMapping("/blood/{id}")
    public String deleteBasecamp(@PathVariable Long id) {
        Blood existingBasecamp = donationService.getblood(id);
        if (existingBasecamp != null) {
            donationService.deleteblood(id);
            return "Deleted";
        } else {
            return "No Data Found";
        }
    }

    @GetMapping("/gets/{name}")
    public int gets(@PathVariable("name") String a)
    {
        int  b = donationService.getById(a);
        if(b != 0)
        {
            return b;
        }
        return 0;
    }
    


}
