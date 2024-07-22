package com.yousef.myApp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class AppConfig {

    @Bean
    public ChickenPizza chickenPizza(){
        return new ChickenPizza();
    }

}
