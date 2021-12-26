package org.lazmentor.sendmessage.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor

public class MainController {

    private final AmqpTemplate amqpTemplate;

    @GetMapping("/hello")
    public String sendMessage() {
        amqpTemplate.convertAndSend("queue1", "Hello");
        return "Hello";
    }
}
