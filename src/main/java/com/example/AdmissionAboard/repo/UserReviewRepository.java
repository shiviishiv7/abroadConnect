package com.example.AdmissionAboard.repo;

import com.example.AdmissionAboard.model.UserReview;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserReviewRepository extends JpaRepository<UserReview, Long> {
    // Additional custom query methods can be defined here
}

