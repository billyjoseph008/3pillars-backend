package com.interview.threepillars.service;

import com.interview.threepillars.model.RandomUser;
import com.interview.threepillars.repository.RandomUserRepository;
import lombok.RequiredArgsConstructor;
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
                .orElseThrow(() -> new IllegalArgumentException("RandomUser not found: " + id));
    }

    public RandomUser create(RandomUser entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public RandomUser update(Long id, RandomUser dto) {
        RandomUser existing = getById(id);

        existing.setFirstname(dto.getFirstname());
        existing.setLastname(dto.getLastname());
        existing.setAge(dto.getAge());
        existing.setCountry(dto.getCountry());
        existing.setAvatar(dto.getAvatar());

        return repository.save(existing);
    }

    public void delete(Long id) {
        if (!repository.existsById(Math.toIntExact(id))) {
            throw new IllegalArgumentException("RandomUser not found: " + id);
        }
        repository.deleteById(Math.toIntExact(id));
    }
}