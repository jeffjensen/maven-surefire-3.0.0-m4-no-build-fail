package com.jeffjensen.surefire;

import com.jeffjensen.notseen.AutowiredClass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Note that @SpringBootApplication has no impact on the issue
@SpringBootApplication
public class Application {
    @Autowired
    private AutowiredClass autowiredClass;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
