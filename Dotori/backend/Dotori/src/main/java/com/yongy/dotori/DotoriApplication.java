package com.yongy.dotori;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class DotoriApplication {

    public static void main(String[] args) {
        SpringApplication.run(DotoriApplication.class, args);
    }

}
