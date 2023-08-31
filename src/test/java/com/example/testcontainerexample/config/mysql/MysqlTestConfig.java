package com.example.testcontainerexample.config.mysql;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.springframework.test.context.ActiveProfiles;
import org.testcontainers.containers.MySQLContainer;
import org.testcontainers.junit.jupiter.Container;

@TestConfiguration
public class MysqlTestConfig {
    @Container
    @ServiceConnection
    public static MySQLContainer<?> MY_SQL_CONTAINER = new MySQLContainer<>("mysql:8.0.24");

    @PostConstruct
    void postConstruct() {
        MY_SQL_CONTAINER.start();
    }

    @PreDestroy
    void preDestroy() {
        MY_SQL_CONTAINER.stop();
    }
}
