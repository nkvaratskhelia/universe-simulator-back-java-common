package com.example.universe.simulator.common.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

@ConfigurationProperties(prefix = "app.caching")
@Validated
@Getter @Setter
public class CachingProperties {
    /**
     * Enables app-wide caching.
     */
    private boolean enabled;
}
