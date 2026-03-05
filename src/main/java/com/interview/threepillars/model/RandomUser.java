package com.interview.threepillars.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "random_user")
public class RandomUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "firstname", length = 50)
    private String firstname;

    @Column(name = "lastname", length = 50)
    private String lastname;

    @Column(name = "age", nullable = false)
    private Integer age;

    @Column(name = "country", length = 100)
    private String country;

    @Column(name = "avatar", length = 250)
    private String avatar;

    @Column(name = "created_at")
    private Instant createdAt;


}