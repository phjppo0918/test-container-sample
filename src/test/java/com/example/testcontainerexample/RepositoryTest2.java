package com.example.testcontainerexample;

import com.example.testcontainerexample.config.IntegrationTest;
import com.example.testcontainerexample.hello.Hello;
import com.example.testcontainerexample.hello.HelloRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.assertThat;

@IntegrationTest
class RepositoryTest2 {
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
