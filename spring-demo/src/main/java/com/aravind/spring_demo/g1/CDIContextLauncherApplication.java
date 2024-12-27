package com.aravind.spring_demo.g1;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Named
//@Component
class SomeClass {

  private SomeDependency someDependency;

//  public SomeClass(SomeDependency someDependency) {
//    this.someDependency = someDependency;
//    System.out.println("Dependencies initialized.");
//  }


//  @Autowired
  @Inject
  public void setSomeDependency(SomeDependency someDependency) {
    this.someDependency = someDependency;
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

@Named
class SomeDependency {

}

@Configuration
@ComponentScan
public class CDIContextLauncherApplication {

  public static void main(String[] args) {
    try(var context = new AnnotationConfigApplicationContext(CDIContextLauncherApplication.class)) {
      Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
    }
  }
}
