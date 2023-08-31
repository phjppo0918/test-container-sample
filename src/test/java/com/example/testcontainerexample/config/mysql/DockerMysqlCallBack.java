package com.example.testcontainerexample.config.mysql;

import org.junit.jupiter.api.extension.AfterAllCallback;
import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.Extension;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.testcontainers.containers.MySQLContainer;
import org.testcontainers.junit.jupiter.Container;

public class DockerMysqlCallBack implements BeforeAllCallback, AfterAllCallback {

    @Container
    @ServiceConnection
    public static MySQLContainer<?> MY_SQL_CONTAINER =  new MySQLContainer<>("mysql:8.0.24");

    @Override
    public void beforeAll(final ExtensionContext context) {
        MY_SQL_CONTAINER.start();
    }

    @Override
    public void afterAll(final ExtensionContext context) {
        MY_SQL_CONTAINER.stop();
    }
}
