package com.example.AdmissionAboard.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    private String email;
    private String password;
    private int userType=3;
}
