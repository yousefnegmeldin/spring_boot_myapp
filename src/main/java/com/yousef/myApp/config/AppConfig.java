package com.yousef.myApp.config;

import com.yousef.myApp.services.FirstService;
import com.yousef.myApp.services.SecondService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.io.FileFilter;

@Configuration
public class AppConfig {

    @Bean
    public FirstService firstService(){
        return new FirstService();
    }

    @Bean
    @Scope("prototype")
    public SecondService secondService(){
        return new SecondService();
    }

}
