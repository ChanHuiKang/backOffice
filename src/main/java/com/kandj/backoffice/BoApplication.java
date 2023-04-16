package com.kandj.backoffice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

//@EnableJpaAuditing
@SpringBootApplication
public class BoApplication {
    public static void main(String[] args) {
        SpringApplication.run(BoApplication.class, args);
    }
}
