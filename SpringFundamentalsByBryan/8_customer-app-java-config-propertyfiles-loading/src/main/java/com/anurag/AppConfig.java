package com.anurag;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@ComponentScan({ "com.anurag" })
@PropertySource("my-app.properties")
public class AppConfig {


    //without this instance also propery loading works
//    @Bean
//    public static PropertySourcesPlaceholderConfigurer propertyLoader(){
//        return new PropertySourcesPlaceholderConfigurer();
//    }

}
