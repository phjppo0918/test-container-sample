package com.example.testcontainerexample;

import com.example.testcontainerexample.config.mysql.MysqlTestConfig;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
@Import(MysqlTestConfig.class)
class TestContainerExampleApplicationTests {

    @Test
    void contextLoads() {
    }
}
