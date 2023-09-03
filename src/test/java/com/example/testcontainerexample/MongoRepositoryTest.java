package com.example.testcontainerexample;

import com.example.testcontainerexample.config.IntegrationTest;
import com.example.testcontainerexample.hello.mongo.MongoHello;
import com.example.testcontainerexample.hello.mongo.MongoHelloRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@IntegrationTest
public class MongoRepositoryTest {
    @Autowired
    MongoHelloRepository repository;


    @Test
    @DisplayName("생성 및 조회 수행")
    void runCreateAndFind() {
        repository.save(new MongoHello("asdf", "adsf"));
        final List<MongoHello> list = repository.findAll();
        assertThat(list).hasSize(1);
        assertThat(list.get(0).getId()).isEqualTo("asdf");
    }
}
