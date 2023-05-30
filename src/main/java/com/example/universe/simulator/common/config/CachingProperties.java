package com.example.universe.simulator.common.config;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("app.caching")
@AllArgsConstructor
@Getter
class CachingProperties {

    /**
     * Enables app-wide caching.
     */
    private boolean enabled;
}
