package com.aravind.spring_demo.learnSpringFramework02;

import org.springframework.stereotype.Component;

@Component
public interface GamingConsole {

    public void up();
    public void down();
    public void left();
    public void right();
}
