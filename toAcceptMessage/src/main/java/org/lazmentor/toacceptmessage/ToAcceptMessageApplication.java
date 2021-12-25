package org.lazmentor.toacceptmessage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ToAcceptMessageApplication {

    public static void main(String[] args) {
        SpringApplication.run(ToAcceptMessageApplication.class, args);
    }

}
