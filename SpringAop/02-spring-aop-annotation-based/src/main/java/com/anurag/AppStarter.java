package com.anurag;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(value = "classpath:aopconfig.xml")
public class AppStarter extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(AppStarter.class);
    }
}
