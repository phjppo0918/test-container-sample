package com.example.testcontainerexample.hello;

import org.springframework.data.jpa.repository.JpaRepository;

public interface HelloRepository extends JpaRepository<Hello, String> {
}
