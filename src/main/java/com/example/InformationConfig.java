package com.example;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Bean;

@Configuration
@PropertySource("information.properties")
@ComponentScan("com.example")
public class InformationConfig {
    //sport breaking new service bean
    @Bean
    public SportBreakingNewsService sportBreakingNewsService(){
        return new SportBreakingNewsService();
    }
    //sport information bean
    @Bean
    public SportInformation sportInformation(){
        return new SportInformation(sportBreakingNewsService());
    }
}
