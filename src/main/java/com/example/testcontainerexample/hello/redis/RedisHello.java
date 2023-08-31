package com.example.testcontainerexample.hello.redis;

import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@Getter
@RedisHash("product")
public class RedisHello {
    @Id
    private String id;
    private String name;

    public RedisHello(final String id, final String name) {
        this.id = id;
        this.name = name;
    }
}
