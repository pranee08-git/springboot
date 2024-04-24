package com.example.Donation_Centre.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.Donation_Centre.model.Blood;

public interface BloodRepository extends JpaRepository<Blood, Long> {
    
    @Query("select e.donor_id from Blood e where e.donor_name = ?1")
    int findByDonor_name(String a);
}
