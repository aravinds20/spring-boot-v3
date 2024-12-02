package com.aravind.spring_demo.game;

public class Islander implements Game {

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

