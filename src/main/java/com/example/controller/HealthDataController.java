package com.example.controller;

import com.example.model.HealthData;
import com.example.service.HealthDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/health")
public class HealthDataController {

    @Autowired
    private HealthDataService healthDataService;

    @GetMapping("/data/{userId}")
    public HealthData getHealthData(@PathVariable Long userId) {
        return healthDataService.getHealthData(userId);
    }

    @PostMapping("/data")
    public HealthData saveHealthData(@RequestBody HealthData healthData) {
        return healthDataService.saveHealthData(healthData);
    }
}
