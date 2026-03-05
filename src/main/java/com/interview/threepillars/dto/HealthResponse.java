package com.interview.threepillars.dto;

import lombok.Getter;

@Getter
public class HealthResponse {
    private final String status;
    public HealthResponse(String status) { this.status = status; }
}
