package com.aravind.spring_demo.f1;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class SomeClass {

  private SomeDependency someDependency;

  public SomeClass(SomeDependency someDependency) {
    this.someDependency = someDependency;
    System.out.println("Dependencies initialized.");
  }

  @PostConstruct
  private void initialSetup() {
    System.out.println("Initial setup.");
  }

  @PreDestroy
  private void cleanUp() {
    System.out.println("clean up.");
  }
}

@Component
class SomeDependency {

}

@Configuration
@ComponentScan
public class PreDestructAndPostConstructLauncher {

  public static void main(String[] args) {
    try(var context = new AnnotationConfigApplicationContext(PreDestructAndPostConstructLauncher.class)) {
      Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
    }
  }
}
