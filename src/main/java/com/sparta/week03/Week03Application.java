package com.sparta.week03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class Week03Application {

    public static void main(String[] args) {
        SpringApplication.run(Week03Application.class, args);
    }
    @SpringBootApplication(exclude = SecurityAutoConfiguration.class)
    public class FeedApplication {

        public void main(String[] args) {
            SpringApplication.run(FeedApplication.class, args);
        }
    }
}
