package com.example.testcontainerexample.hello;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class Hello {
    @Id  String name;
    String description;

    public Hello(final String name, final String description) {
        this.name = name;
        this.description = description;
    }
}
