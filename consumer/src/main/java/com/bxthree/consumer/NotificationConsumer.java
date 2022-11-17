package com.bxthree.consumer;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.function.Consumer;

@Component
public class NotificationConsumer {

    @Bean
    public Consumer<String> onReceive() {
        return message -> System.out.println("Received: " + message);
    }
}
