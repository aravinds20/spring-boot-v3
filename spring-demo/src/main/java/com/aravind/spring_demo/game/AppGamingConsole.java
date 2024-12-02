package com.aravind.spring_demo.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppGamingConsole {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(GamingConfiguration.class);
        context.getBean(Game.class).up();
        context.getBean(GameRunner.class).run();
    }

}
