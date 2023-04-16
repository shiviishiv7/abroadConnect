package com.example.AdmissionAboard.repo;

import com.example.AdmissionAboard.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
    // Additional custom query methods can be defined here
}

