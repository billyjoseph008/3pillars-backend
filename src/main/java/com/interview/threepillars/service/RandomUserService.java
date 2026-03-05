package com.interview.threepillars.service;


import com.interview.threepillars.model.RandomUser;
import com.interview.threepillars.repository.RandomUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RandomUserService {

    private final RandomUserRepository repository;

    public List<RandomUser> getAll() {
        return repository.findAll();
    }

    public RandomUser getById(Long id) {
        return repository.findById(Math.toIntExact(id))
                .orElseThrow(() -> new RuntimeException("RandomUserService not found"));
    }

    public RandomUser create(RandomUser entity) {
        RandomUser saved = repository.save(entity);
        return saved;
    }

    public RandomUser update(Long id, RandomUser dto) {
        return repository.findById(Math.toIntExact(id))
                .orElseThrow(() -> new RuntimeException("RandomUserService not found"));
    }

    public void delete(Long id) {
        repository.deleteById(Math.toIntExact(id));
    }


}
