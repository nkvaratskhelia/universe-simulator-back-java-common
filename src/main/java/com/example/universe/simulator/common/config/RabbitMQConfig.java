package com.example.universe.simulator.common.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Declarables;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.ExchangeBuilder;
import org.springframework.amqp.core.QueueBuilder;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = false)
public class RabbitMQConfig {

    @Bean
    public Jackson2JsonMessageConverter messageConverter(ObjectMapper objectMapper) {
        return new Jackson2JsonMessageConverter(objectMapper);
    }

    @Bean
    public Declarables declarables(@Value("${spring.rabbitmq.template.exchange}") String exchangeName,
                                   @Value("${app.rabbitmq.event-queue}") String eventQueueName) {
        DirectExchange exchange = ExchangeBuilder
            .directExchange(exchangeName)
            .build();

        var eventQueue = QueueBuilder
            .durable(eventQueueName)
            .build();
        var eventQueueBinding = BindingBuilder
            .bind(eventQueue)
            .to(exchange)
            .with(eventQueueName);

        return new Declarables(exchange, eventQueue, eventQueueBinding);
    }
}
