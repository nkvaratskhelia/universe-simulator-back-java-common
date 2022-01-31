package com.example.universe.simulator.common.dtos;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.OffsetDateTime;

@Getter @Setter
@Builder
@EqualsAndHashCode
@ToString
public class EventDto {

    private String type;

    private String data;

    private OffsetDateTime time;
}
