package com.example.consumer.KafkaConsumer.listeners;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConsumerListener {
    private final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumerListener.class);

    @KafkaListener(topics = {"Topic-1"}, groupId = "my-group-id")
    public void listener(String message){
        LOGGER.info("Received message: {}", message);
    }
}
