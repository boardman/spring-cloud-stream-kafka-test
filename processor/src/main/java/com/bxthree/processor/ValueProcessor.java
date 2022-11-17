package com.bxthree.processor;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class ValueProcessor {
    @Bean
    public Function<String, String> convertToUpperCase() {
        return value -> {
            System.out.println("Converting to upper case: " + value.toUpperCase());
            return value.toUpperCase();
        };
    }
}
