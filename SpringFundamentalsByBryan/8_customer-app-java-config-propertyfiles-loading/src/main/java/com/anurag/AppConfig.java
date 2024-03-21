package com.anurag;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;

@Configuration
@ComponentScan({ "com.anurag" })
@PropertySource("my-app.properties")
public class AppConfig {


    //without this instance also property loading works
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyLoader(){
        PropertySourcesPlaceholderConfigurer config = new PropertySourcesPlaceholderConfigurer();
        config.setLocation(new ClassPathResource("my-app.properties"));
        return config;
    }

}
