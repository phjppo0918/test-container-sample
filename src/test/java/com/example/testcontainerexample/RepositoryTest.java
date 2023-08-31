package com.example.testcontainerexample;

import com.example.testcontainerexample.hello.Hello;
import com.example.testcontainerexample.hello.HelloRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.testcontainers.containers.MySQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@ActiveProfiles("test")
@Testcontainers
public class RepositoryTest {
    @Autowired
    HelloRepository helloRepository;

    @Container
    @ServiceConnection
    public static MySQLContainer<?> MY_SQL_CONTAINER =  new MySQLContainer<>("mysql:8.0.24");

    @Test
    @DisplayName("생성 및 조회를 수행한다")
    void runCreateAndFind() {
        MY_SQL_CONTAINER.start();
        Hello hello = new Hello("asdf", "asdf");
        helloRepository.save(hello);

        assertThat(helloRepository.findAll()).hasSize(1);
    }
}
