package com.example.AdmissionAboard.repo;

import com.example.AdmissionAboard.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepository extends JpaRepository<Location, Long> {
    // Additional custom query methods can be defined here
}

