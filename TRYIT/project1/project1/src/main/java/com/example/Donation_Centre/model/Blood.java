package com.example.Donation_Centre.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

// import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
// import jakarta.persistence.OneToOne;
// import jakarta.persistence.OneToOne;
// import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Blood 
{
    @Id
    private Long donor_id;
    private String donor_name;
    private int age;     
    private String blood_group;
    private int unit;
    private String address;
    private String disease;

    // @OneToOne(cascade = CascadeType.ALL,mappedBy = "blood")
    // private Eye eye;
    @OneToMany
    @JsonManagedReference
    private List<Eye> eye;

}
