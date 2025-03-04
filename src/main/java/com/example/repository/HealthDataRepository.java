package com.example.repository;

import com.example.model.HealthData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HealthDataRepository extends JpaRepository<HealthData, Long> {
    HealthData findByUserId(Long userId);
}
