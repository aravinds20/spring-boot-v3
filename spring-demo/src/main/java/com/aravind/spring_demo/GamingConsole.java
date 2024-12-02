package com.aravind.spring_demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConsole {

    @Bean
    public Supermario supermario() {
        return new Supermario();
    }

}
