package com.example.universe.simulator.common.dtos;

import java.time.Instant;

public record ErrorDto(String errorCode, Instant time) {}
