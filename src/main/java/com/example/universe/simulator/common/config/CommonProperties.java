package com.example.universe.simulator.common.config;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("app")
@AllArgsConstructor
@Getter
public class CommonProperties {

    /**
     * Logstash url in the form of host:port.
     */
    private String logstashUrl;
}
