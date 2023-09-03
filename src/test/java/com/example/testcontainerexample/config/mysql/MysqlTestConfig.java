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
    private static GenericContainer<?> MYSQL = new GenericContainer<>("mysql:8.0.24");


   static {
        MYSQL.start();
   }

    @PreDestroy
    void preDestroy() {
        MYSQL.stop();
    }
}
