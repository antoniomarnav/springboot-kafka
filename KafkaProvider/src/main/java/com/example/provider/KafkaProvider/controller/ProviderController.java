package com.example.provider.KafkaProvider.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/kafka")
public class ProviderController {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    private final Logger LOGGER = LoggerFactory.getLogger(ProviderController.class);

    @PostMapping
    public ResponseEntity<String> sendMessage(@RequestParam("message") String message) {
        try {
            LOGGER.info("SendMessage: {}", message);
            kafkaTemplate.send("test-topic", message);
            return new ResponseEntity<>("OK", HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>("ERROR", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
