package com.example.universe.simulator.common.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "app")
@Component
@Getter @Setter
public class CommonProperties {

    /**
     * Logstash url in the form of host:port.
     */
    private String logstashUrl;
}
