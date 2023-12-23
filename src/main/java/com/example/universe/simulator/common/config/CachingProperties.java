package com.example.universe.simulator.common.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("app.caching")
public record CachingProperties(boolean enabled) { }
