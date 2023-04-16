package com.example.AdmissionAboard.repo;

import com.example.AdmissionAboard.model.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, Long> {
    // Additional custom query methods can be defined here
}

