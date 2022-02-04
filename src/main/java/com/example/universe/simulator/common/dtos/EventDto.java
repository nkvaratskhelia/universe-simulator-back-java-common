package com.example.universe.simulator.common.dtos;

import java.time.OffsetDateTime;

public record EventDto(String type, String data, OffsetDateTime time) {}
