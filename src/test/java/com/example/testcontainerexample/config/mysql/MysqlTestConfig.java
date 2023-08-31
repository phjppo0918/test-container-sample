package com.example.testcontainerexample.config.mysql;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.containers.MySQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.utility.DockerImageName;

@TestConfiguration
public class MysqlTestConfig {
    @Container
    @ServiceConnection
    private static MySQLContainer<?> MYSQL = new MySQLContainer<>("mysql:8.0.24");


    @PostConstruct
    void postConstruct() {
        MYSQL.start();
    }

    @PreDestroy
    void preDestroy() {
        MYSQL.stop();
    }
}
