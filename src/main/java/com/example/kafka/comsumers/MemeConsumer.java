package com.example.kafka.comsumers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class MemeConsumer {
    @KafkaListener(topics = "memes", groupId = "group_id")
    public void consumeMessage(String message) {
        log.info("Received meme: " + message);
        System.out.println(message);
    }
}
