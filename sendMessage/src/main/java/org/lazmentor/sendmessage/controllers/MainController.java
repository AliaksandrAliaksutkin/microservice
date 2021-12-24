package org.lazmentor.sendmessage.controllers;

import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@Log
@RestController
public class MainController {

    private final AmqpTemplate amqpTemplate;
    @GetMapping()
    public String sendMess(){
        amqpTemplate.convertAndSend("queue1", "Hello");
        return "Hello";
    }
}
