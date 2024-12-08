package com.aravind.spring_demo.learnSpringFramework02;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Supermario implements GamingConsole {

    public void up(){
        System.out.println("Jump");
    }
    public void down(){
        System.out.println("duck");
    }
    public void left(){
        System.out.println("back");
    }
    public void right(){
        System.out.println("run");
    }
}
