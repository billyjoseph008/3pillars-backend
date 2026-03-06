package com.interview.threepillars.controller;
import com.interview.threepillars.model.RandomUser;
import com.interview.threepillars.service.RandomUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:5173")
public class RandomUserController {

    private final RandomUserService service;

    @GetMapping
    public List<RandomUser> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public RandomUser getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping
    public RandomUser create(@RequestBody RandomUser dto) {
        return service.create(dto);
    }

    @PutMapping("/{id}")
    public RandomUser update(@PathVariable Long id, @RequestBody RandomUser dto) {
        return service.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }


}