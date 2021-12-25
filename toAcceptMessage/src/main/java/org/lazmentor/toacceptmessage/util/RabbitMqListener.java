package org.lazmentor.toacceptmessage.util;

import lombok.RequiredArgsConstructor;
import org.lazmentor.toacceptmessage.model.Hello;
import org.lazmentor.toacceptmessage.service.HelloService;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;


@Component
@RequiredArgsConstructor
public class RabbitMqListener {

    private final HelloService helloService;

    @RabbitListener(queues = "queue1")
    public void processQueue1(String message) {
        helloService.saveHello(new Hello(message));
    }
}
