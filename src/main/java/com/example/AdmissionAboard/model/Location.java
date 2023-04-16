package com.example.AdmissionAboard.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data

public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    private String address1;
    private String address2;
    private String postalCode;
    private String phoneNumber;
    private String cityName;
    private String stateName;
    private String country;
    private Long userId;

}
