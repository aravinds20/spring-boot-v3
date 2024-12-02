package com.aravind.spring_demo.game;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {

    @Bean
    public Game game() {
        return new Pacman();
    }

    @Bean
    public GameRunner gameRunner(Game game) {
        return new GameRunner(game);
    }

}
