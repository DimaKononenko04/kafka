package com.example.kafka.controllers;

import com.example.kafka.producers.MemeProducer;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/memes")
@AllArgsConstructor
public class MemeProducerController {

    private final MemeProducer memeProducer;

    @PostMapping("/publish")
    public String sendMessageToTopic(@RequestParam("message") String message) {
        memeProducer.sendMessage(message);
        return "Message has been sent";
    }
}
