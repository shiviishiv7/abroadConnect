package com.example.AdmissionAboard.repo;

import com.example.AdmissionAboard.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {
    // Additional custom query methods can be defined here
}

