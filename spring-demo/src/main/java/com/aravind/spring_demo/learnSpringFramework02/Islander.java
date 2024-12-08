package com.aravind.spring_demo.learnSpringFramework02;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Islander")
public class Islander implements GamingConsole {

    public void up(){
        System.out.println("Jump");
    }
    public void down(){
        System.out.println("crawl");
    }
    public void left(){
        System.out.println("walk");
    }
    public void right(){
        System.out.println("run");
    }
}

