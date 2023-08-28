package com.example.testcontainerexample.hello;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;

@Entity
@Getter
public class Hello {
    @Id  String name;
    String description;
}
