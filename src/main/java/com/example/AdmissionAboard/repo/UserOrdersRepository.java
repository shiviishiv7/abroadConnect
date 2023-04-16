package com.example.AdmissionAboard.repo;

import com.example.AdmissionAboard.model.UserOrders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserOrdersRepository extends JpaRepository<UserOrders, Long> {
    // Additional custom query methods can be defined here
}

