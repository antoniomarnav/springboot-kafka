package com.example.consumer.KafkaConsumer.listeners;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerListener {
    private final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumerListener.class);

    @KafkaListener(topics = "test-topic", groupId = "my-group-id")
    public void listener(String message){
        LOGGER.info("Received message: {}", message);
    }
}
