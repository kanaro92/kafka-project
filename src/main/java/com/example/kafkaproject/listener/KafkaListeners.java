package com.example.kafkaproject.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class KafkaListeners {

    @KafkaListener(topics = "kafka-topic-1", groupId = "groupId")
    public void listener(String data){
        log.info("******* data received from kafka-topic-1 {} *******", data);
    }
}
