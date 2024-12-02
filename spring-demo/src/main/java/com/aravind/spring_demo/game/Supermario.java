package com.aravind.spring_demo.game;

public class Supermario implements Game {

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
