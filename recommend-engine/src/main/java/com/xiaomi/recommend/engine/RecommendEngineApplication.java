package com.xiaomi.recommend.engine;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.xiaomi.recommend.engine")
@SpringBootApplication
public class RecommendEngineApplication {

    public static void main(String[] args) {
        SpringApplication.run(RecommendEngineApplication.class, args);
    }
}
