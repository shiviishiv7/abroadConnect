package com.example.AdmissionAboard.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data

public class University {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;
    private String description;
    private Long locationId;
    private Long userId;
}
