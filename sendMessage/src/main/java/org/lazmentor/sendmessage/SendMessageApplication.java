package org.lazmentor.sendmessage;

import org.lazmentor.sendmessage.configuration.RabbitConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Import;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@Import(RabbitConfiguration.class)
public class SendMessageApplication {

    public static void main(String[] args) {
        SpringApplication.run(SendMessageApplication.class, args);
    }
}
