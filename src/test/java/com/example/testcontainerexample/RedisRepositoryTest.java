package com.example.testcontainerexample;

import com.example.testcontainerexample.config.IntegrationTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@IntegrationTest
class RedisRepositoryTest {
    @Autowired
    RedisTemplate<String, String> redisTemplate;



    @Test
    @DisplayName("생성 및 조회")
    void runCreate() {
        redisTemplate.opsForList().leftPush("asdf", "asdf");

        final List<String> list = redisTemplate.opsForList().range("asdf", 0, -1);

        assertThat(list).hasSize(1);
        assertThat(list.get(0)).isEqualTo("asdf");
    }
}
