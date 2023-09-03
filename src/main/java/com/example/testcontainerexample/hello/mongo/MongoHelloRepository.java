package com.example.testcontainerexample.hello.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface MongoHelloRepository extends MongoRepository<MongoHello, String> {
}
