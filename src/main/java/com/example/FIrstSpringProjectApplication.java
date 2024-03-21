package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.io.IOException;

@SpringBootApplication
@ComponentScan("com.example")
public class FIrstSpringProjectApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(FIrstSpringProjectApplication.class, args);
    }

}
