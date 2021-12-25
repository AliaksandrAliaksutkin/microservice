package org.lazmentor.sendmessage.controllers;

import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log
@RequiredArgsConstructor
@RequestMapping("/hello")
public class MainController {

    private final AmqpTemplate amqpTemplate;

    public String sendMessage() {
        log.info("Emit to queue1");
        amqpTemplate.convertAndSend("queue1", "HelloMessage");
        return "Hello";
    }
}
