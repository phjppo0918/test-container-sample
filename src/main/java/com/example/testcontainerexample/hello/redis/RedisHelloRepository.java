package com.example.testcontainerexample.hello.redis;

import org.springframework.data.repository.CrudRepository;

public interface RedisHelloRepository extends CrudRepository<RedisHello, String> {
}
