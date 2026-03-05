package com.interview.threepillars.dto;

import lombok.Value;

import java.io.Serializable;
import java.time.Instant;

/**
 * DTO for {@link com.interview.threepillars.model.RandomUser}
 */
@Value
public class RandomUserDto implements Serializable {
    Long id;
    String firstname;
    String lastname;
    Integer age;
    String country;
    String avatar;
    Instant createdAt;
}