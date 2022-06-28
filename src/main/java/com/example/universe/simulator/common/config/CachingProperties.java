package com.example.universe.simulator.common.config;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@ConfigurationProperties(prefix = "app.caching")
@ConstructorBinding
@AllArgsConstructor
@Getter
public class CachingProperties {

    /**
     * Enables app-wide caching.
     */
    private boolean enabled;
}
