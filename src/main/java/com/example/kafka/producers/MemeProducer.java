package com.example.kafka.producers;

import lombok.AllArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MemeProducer {

    private final KafkaTemplate<String,String> kafkaTemplate;

    public void sendMessage(String message) {
        this.kafkaTemplate.send("memes",message);
    }

}
