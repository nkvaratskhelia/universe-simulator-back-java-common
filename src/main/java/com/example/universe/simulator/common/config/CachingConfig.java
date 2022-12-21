package com.example.universe.simulator.common.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.serializer.RedisSerializationContext;
import org.springframework.data.redis.serializer.RedisSerializer;

import java.time.Duration;

@Configuration(proxyBeanMethods = false)
@ConditionalOnProperty(prefix = "app.caching", name = "enabled", havingValue = "true")
@EnableCaching
public class CachingConfig {

    @Bean
    public RedisCacheConfiguration cacheConfiguration(@Value("${spring.cache.redis.time-to-live}") Duration timeToLive) {
        return RedisCacheConfiguration.defaultCacheConfig()
            .entryTtl(timeToLive)
            .disableCachingNullValues()
            .serializeValuesWith(RedisSerializationContext.SerializationPair.fromSerializer(RedisSerializer.json()));
    }
}
