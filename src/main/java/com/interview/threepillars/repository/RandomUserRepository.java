package com.interview.threepillars.repository;

import com.interview.threepillars.model.RandomUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RandomUserRepository extends JpaRepository<RandomUser, Integer> {

}
