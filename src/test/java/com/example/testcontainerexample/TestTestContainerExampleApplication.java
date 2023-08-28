package com.example.testcontainerexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestTestContainerExampleApplication {

    public static void main(String[] args) {
        SpringApplication.from(TestContainerExampleApplication::main).with(TestTestContainerExampleApplication.class).run(args);
    }

}
