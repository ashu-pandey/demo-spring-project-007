package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoSpringBootApplication {

    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println("Neeraj");
        SpringApplication.run(DemoSpringBootApplication.class, args);
    }

}
