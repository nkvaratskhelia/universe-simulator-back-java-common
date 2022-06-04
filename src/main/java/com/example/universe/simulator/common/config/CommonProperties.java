package com.example.universe.simulator.common.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

@ConfigurationProperties(prefix = "app")
@Validated
@Getter @Setter
public class CommonProperties {

    /**
     * Logstash url in the form of host:port.
     */
    @NotBlank
    private String logstashUrl;

    @Valid
    private RabbitMQProperties rabbitmq = new RabbitMQProperties();

    @Getter @Setter
    public static class RabbitMQProperties {

        /**
         * Name of the event queue.
         */
        @NotBlank
        private String eventQueue;
    }
}
