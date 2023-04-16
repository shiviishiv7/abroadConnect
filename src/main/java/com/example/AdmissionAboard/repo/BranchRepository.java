package com.example.AdmissionAboard.repo;

import com.example.AdmissionAboard.model.Branch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BranchRepository extends JpaRepository<Branch, Long> {
    // Additional custom query methods can be defined here
}

