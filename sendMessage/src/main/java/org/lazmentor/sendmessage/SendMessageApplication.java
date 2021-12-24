package org.lazmentor.sendmessage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SendMessageApplication {
    public static void main(String[] args) {
        SpringApplication.run(SendMessageApplication.class, args);
    }
}
