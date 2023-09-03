package com.example.testcontainerexample.config;

import com.example.testcontainerexample.config.mysql.MysqlTestConfig;
import com.example.testcontainerexample.config.redis.RedisTestConfig;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ActiveProfiles;
import org.testcontainers.junit.jupiter.Testcontainers;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import({MysqlTestConfig.class, RedisTestConfig.class})
@SpringBootTest
@ActiveProfiles("test")
public @interface IntegrationTest {
}
