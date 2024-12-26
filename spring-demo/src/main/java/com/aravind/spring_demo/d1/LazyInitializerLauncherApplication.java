package com.aravind.spring_demo.d1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class A {

}

@Lazy
@Component
class B {

  private A classA;

  public B(A classA) {
    System.out.println("Some initialization logic.");
    this.classA = classA;
  }

  public void doSomething() {
    System.out.println("doing something...");
  }

}

@ComponentScan
public class LazyInitializerLauncherApplication {

  public static void main(String[] args) {
    try(var context = new AnnotationConfigApplicationContext(LazyInitializerLauncherApplication.class)) {
      Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
      System.out.println("initialization complete.");

      //the bean will be loaded only when this will be needed. In this scenario, only here will it be created.
      context.getBean(B.class).doSomething();
    }
  }
}
