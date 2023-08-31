package com.example.testcontainerexample;

import com.example.testcontainerexample.config.IntegrationTest;
import com.example.testcontainerexample.hello.redis.RedisHello;
import com.example.testcontainerexample.hello.redis.RedisHelloRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

@IntegrationTest
class RedisRepositoryTest {
    @Autowired
    RedisHelloRepository redisHelloRepository;

    @Test
    @DisplayName("생성 및 조회")
    void runCreate() {
        RedisHello redisHello = new RedisHello("adsf", "asdf");
        redisHelloRepository.save(redisHello);
    }
}
