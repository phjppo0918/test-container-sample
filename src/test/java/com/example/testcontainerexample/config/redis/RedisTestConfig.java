package com.example.testcontainerexample.config.redis;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.utility.DockerImageName;

@TestConfiguration
public class RedisTestConfig {

    @Container
    @ServiceConnection
    private static GenericContainer<?> REDIS = new GenericContainer<>(DockerImageName.parse("redis:7.0.8-alpine"))
            .withExposedPorts(6379).withReuse(true);

    @PostConstruct
    void postConstruct() {
       // System.setProperty("spring.redis.host", REDIS.getHost());
        REDIS.start();
    }

    @PreDestroy
    void preDestroy() {
        REDIS.stop();
    }
}
