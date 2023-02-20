package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoSpringBootApplication {

    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println("Neeraj");
        System.out.println("Ashu");
        System.out.println("Pandey");
        SpringApplication.run(DemoSpringBootApplication.class, args);
    }

}
