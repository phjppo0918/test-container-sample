package com.example.testcontainerexample;

import com.example.testcontainerexample.config.mysql.EnableMysqlTest;
import com.example.testcontainerexample.hello.Hello;
import com.example.testcontainerexample.hello.HelloRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;


import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@ActiveProfiles("test")
@EnableMysqlTest
class RepositoryTest {
    @Autowired
    HelloRepository helloRepository;

    @Test
    @DisplayName("생성 및 조회를 수행한다")
    void runCreateAndFind() {
        Hello hello = new Hello("asdf", "asdf");
        helloRepository.save(hello);

        assertThat(helloRepository.findAll()).hasSize(1);
    }
}
