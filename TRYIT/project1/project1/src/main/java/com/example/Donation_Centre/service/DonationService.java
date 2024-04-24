package com.example.Donation_Centre.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Donation_Centre.model.Blood;
import com.example.Donation_Centre.model.Eye;
import com.example.Donation_Centre.repository.BloodRepository;
import com.example.Donation_Centre.repository.EyeRepository;

import java.util.List;

@Service
public class DonationService {

    @Autowired
    private EyeRepository eyeRepository;

    @Autowired
    private BloodRepository bloodRepository;

    // eye operations
    public Eye saveeye(Eye eye) {
        return eyeRepository.save(eye);
    }

    public List<Eye> geteye() {
        return eyeRepository.findAll();
    }

    public Eye geteye(Long id) {
        return eyeRepository.findById(id).orElse(null);
    }

    public void deleteeye(Long id) {
        eyeRepository.deleteById(id);
    }

    // blood operations
    public Blood saveblood(Blood blood) {
        return bloodRepository.save(blood);
    }

    public List<Blood> getblood() {
        return bloodRepository.findAll();
    }

    public Blood getblood(Long id) {
        return bloodRepository.findById(id).orElse(null);
    }

    public void deleteblood(Long id) {
        bloodRepository.deleteById(id);
    }
    public int getById(String a)
    {
        return bloodRepository.findByDonor_name(a);
    }
}
