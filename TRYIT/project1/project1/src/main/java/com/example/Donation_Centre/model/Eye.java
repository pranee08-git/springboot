package com.example.Donation_Centre.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

// import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
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
public class Eye 
{
    @Id
    private Long donar_id;
    private String donor_name;
    private int age;
    private String infection;
    private String address;
    private String gender ;

    // @OneToOne(cascade = CascadeType.REMOVE)
    // private Blood blood;
    @ManyToOne
    @JsonBackReference
    private Blood blood;
}
