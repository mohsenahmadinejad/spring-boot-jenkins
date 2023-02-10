package com.example.springbootjenkins;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SpringBootJenkinsApplicationTests {
    static Logger logger = LoggerFactory.getLogger(SpringBootJenkinsApplication.class);

    @Test
    void contextLoads() {
        logger.info("Test is executing..");
        assertEquals(1,1);
    }

}
