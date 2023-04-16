package com.example.AdmissionAboard.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data

public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;
    private String decription;

    private Long universityId;
    private Long userId;
}
