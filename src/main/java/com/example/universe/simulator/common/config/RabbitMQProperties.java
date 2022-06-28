package com.example.universe.simulator.common.config;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;

@ConfigurationProperties(prefix = "app.rabbitmq")
@ConstructorBinding
@Validated
@AllArgsConstructor
@Getter
public class RabbitMQProperties {

    /**
     * Name of the event queue.
     */
    @NotBlank
    private String eventQueue;
}
