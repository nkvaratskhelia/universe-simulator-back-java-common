package com.example.universe.simulator.common.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.serializer.RedisSerializationContext;
import org.springframework.data.redis.serializer.RedisSerializer;

import java.time.Duration;

@AutoConfiguration
@EnableConfigurationProperties(CachingProperties.class)
@ConditionalOnProperty(prefix = "app.caching", name = "enabled", havingValue = "true")
@EnableCaching
public class CachingConfig {

    @Bean
    RedisCacheConfiguration cacheConfiguration(@Value("${spring.cache.redis.time-to-live}") Duration timeToLive) {
        return RedisCacheConfiguration.defaultCacheConfig()
            .entryTtl(timeToLive)
            .disableCachingNullValues()
            .serializeValuesWith(RedisSerializationContext.SerializationPair.fromSerializer(RedisSerializer.json()));
    }
}
