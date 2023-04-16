package com.example.AdmissionAboard.repo;

import com.example.AdmissionAboard.model.University;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UniversityRepository extends JpaRepository<University, Long> {
    // Additional custom query methods can be defined here
}

