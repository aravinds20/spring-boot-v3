package com.aravind.spring_demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloWorldController {

    public static void main(String[] args) {

        //		Game game = new Supermario();
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        System.out.println(context.getBean("person01"));
		System.out.println(context.getBean("person02"));
		System.out.println(context.getBean("person03"));

        System.out.println(context.getBean("bakerStreet"));
		System.out.println(context.getBean("address02"));
		System.out.println(context.getBean("address03"));
        System.out.println("Primary address - "+context.getBean(Address.class));
//		GameRunner gameRunner = new GameRunner(game);
//		gameRunner.run();

    }
}
