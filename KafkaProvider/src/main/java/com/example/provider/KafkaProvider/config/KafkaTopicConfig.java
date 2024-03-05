package com.example.provider.KafkaProvider.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.common.config.TopicConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class KafkaTopicConfig {

   /*
   Example to create new topics

   @Bean
    public NewTopic generateTopic(){
        Map<String, String> configurations = new HashMap<>();
        // DELETE (Delete the message), COMPACT (Keep the most recent message)
        configurations.put(TopicConfig.CLEANUP_POLICY_CONFIG, TopicConfig.CLEANUP_POLICY_DELETE);
        configurations.put(TopicConfig.RETENTION_MS_CONFIG, "8640000"); // Message retention time, default -1
        configurations.put(TopicConfig.SEGMENT_BYTES_CONFIG, "1073741824"); // 1 Gb. Maximum segment size, default 1 Gb
        configurations.put(TopicConfig.MAX_MESSAGE_BYTES_CONFIG, "1000012"); // Maximum size of each message, default 1 MB

        return TopicBuilder.name("test-topic")
                .partitions(3)
                .replicas(1)
                .configs(configurations)
                .build();
    }*/
}
