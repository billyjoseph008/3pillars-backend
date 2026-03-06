package com.interview.threepillars.controller;

import com.interview.threepillars.service.StepsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/steps")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:5173")
public class StepsController {

    private final StepsService stepsService;

    @GetMapping
    public Map<Integer, Integer> getSteps() {
        return stepsService.getSteps();
    }

    @PostMapping("/regenerate")
    public Map<Integer, Integer> regenerate() {
        return stepsService.regenerate();
    }
}
