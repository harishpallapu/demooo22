package com.example.service;

import com.example.model.HealthData;
import com.example.repository.HealthDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HealthDataService {

    @Autowired
    private HealthDataRepository healthDataRepository;

    public HealthData getHealthData(Long userId) {
        return healthDataRepository.findByUserId(userId);
    }

    public HealthData saveHealthData(HealthData healthData) {
        return healthDataRepository.save(healthData);
    }
}
