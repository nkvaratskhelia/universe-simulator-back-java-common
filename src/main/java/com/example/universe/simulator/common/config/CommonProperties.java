package com.example.universe.simulator.common.config;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@ConfigurationProperties(prefix = "app")
@ConstructorBinding
@AllArgsConstructor
@Getter
public class CommonProperties {

    /**
     * Logstash url in the form of host:port.
     */
    private String logstashUrl;
}
