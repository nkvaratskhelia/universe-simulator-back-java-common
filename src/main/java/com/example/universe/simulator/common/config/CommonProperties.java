package com.example.universe.simulator.common.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;

@ConfigurationProperties(prefix = "app", ignoreInvalidFields = true)
@Component
@Validated
@Getter @Setter
public class CommonProperties {

    /**
     * Logstash url in the form of host:port.
     */
    @NotBlank
    private String logstashUrl;
}
