package com.example.testcontainerexample.hello.redis;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Slf4j
@Controller
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequestMapping("redis")
public class RedisController {
    RedisTemplate<String, String> redisTemplate;

    @PostMapping
    public void hello() {
        redisTemplate.opsForList().leftPush("asdf", "asdf");
    }

    @GetMapping
    public void hello2() {
        redisTemplate.opsForList().range("asdf", 0, -1).forEach(log::info);
    }
}
