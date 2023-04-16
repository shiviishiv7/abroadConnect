package com.example.AdmissionAboard.model;

import javax.persistence.*;

@Entity
@Table(name = "user_reviews")
public class UserReview {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String comment;

    @Column(nullable = false)
    private int rating;

    private Long userId;

    // Other fields and getter/setter methods
    // ...
}
