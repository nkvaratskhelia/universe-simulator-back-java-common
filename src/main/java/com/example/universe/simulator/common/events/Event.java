package com.example.universe.simulator.common.events;

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
public class Event {

    private String type;

    private String data;

    @EqualsAndHashCode.Exclude
    private OffsetDateTime time;
}
