package com.example.universe.simulator.common.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "app")
@Getter @Setter
public class CommonProperties {

    /**
     * Logstash url in the form of host:port.
     */
    private String logstashUrl;
}
