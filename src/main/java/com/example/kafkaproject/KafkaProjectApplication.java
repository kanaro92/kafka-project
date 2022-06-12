package com.example.kafkaproject;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@Slf4j
@SpringBootApplication
public class KafkaProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaProjectApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(KafkaTemplate<String, String> kafkaTemplate) {
        return args -> {
            log.info("Sending message");
            for (int i = 0; i < 100; i++) {
                kafkaTemplate.send("kafka-topic-1", "Hi Kafka "+i);
            }
        };
    }

}
