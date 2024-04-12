package com.example.hello;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Medicine{
        @Id
        private int medicineId;
        private String medicineName;
        private String medicineFor;
        private String medicineBrand;
        private String manufacturedIn;
        private String medicinePrice;
        private String expiryDate;
}
