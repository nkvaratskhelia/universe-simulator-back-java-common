package com.example.universe.simulator.common.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CommonBeanConfig {

    @Bean
    ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
