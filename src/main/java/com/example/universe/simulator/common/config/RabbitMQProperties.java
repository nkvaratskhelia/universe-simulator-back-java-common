package com.example.universe.simulator.common.config;

import jakarta.validation.constraints.NotBlank;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

@ConfigurationProperties("app.rabbitmq")
@Validated
public record RabbitMQProperties(@NotBlank String eventQueue) { }
