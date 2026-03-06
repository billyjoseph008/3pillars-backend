package com.interview.threepillars.service;

import lombok.Getter;
import org.springframework.stereotype.Service;

import java.security.SecureRandom;
import java.util.LinkedHashMap;
import java.util.Map;

@Service
public class StepsService {

    private final SecureRandom random = new SecureRandom();
    @Getter
    private final Map<Integer, Integer> steps = new LinkedHashMap<>();

    public StepsService() {
        regenerate();
    }

    public Map<Integer, Integer> regenerate() {
        steps.clear();
        for (int key = 1; key <= 10; key++) {
            int value = random.nextInt(10) + 1;
            steps.put(key, value);
        }
        return null;
    }
}
