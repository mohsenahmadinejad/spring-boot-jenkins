package com.example.springbootjenkins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SpringBootJenkinsApplication {


    static Logger logger =LoggerFactory.getLogger(SpringBootJenkinsApplication.class);


    @PostConstruct
    public void init(){
        logger.info("Application started");
    }

    public static void main(String[] args) {
        logger.error("Application executed");

        SpringApplication.run(SpringBootJenkinsApplication.class, args);
    }

}
