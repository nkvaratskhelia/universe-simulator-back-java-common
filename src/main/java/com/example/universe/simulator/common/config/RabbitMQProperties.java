package com.example.universe.simulator.common.config;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

@ConfigurationProperties(prefix = "app.rabbitmq")
@Validated
@AllArgsConstructor
@Getter
class RabbitMQProperties {

    /**
     * Name of the event queue.
     */
    @NotBlank
    private String eventQueue;
}
