package com.aravind.spring_demo.a1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class mainApp {

    private Dependency1 dependency1;

    private Dependency2 dependency2;

//    @Autowired is not mandatory. Just a constructor with all the dependencies would enable the spring to use the
//    constructor to create the object.
//    @Autowired
    public mainApp(Dependency1 dependency1, Dependency2 dependency2) {
        System.out.println("constructor injection.");
        this.dependency1 = dependency1;
        this.dependency2 = dependency2;
    }

    //    @Autowired
//    public void setDependency1(Dependency1 dependency1) {
//        System.out.println("setter injection dependency1");
//        this.dependency1 = dependency1;
//    }
//
//    @Autowired
//    public void setDependency2(Dependency2 dependency2) {
//        System.out.println("setter injection dependency2");
//        this.dependency2 = dependency2;
//    }

    @Override
    public String toString() {
        return "mainApp{" +
            "dependency1=" + dependency1 +
            ", dependency2=" + dependency2 +
            '}';
    }
}

@Component
class Dependency1 {

}

@Component
class Dependency2 {

}

@Configuration
@ComponentScan
public class DependencyInjectionLauncherApplication {

    public static void main(String[] args) {

        try(var context = new AnnotationConfigApplicationContext(DependencyInjectionLauncherApplication.class)){
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(context.getBean(mainApp.class));
        };
    }
}
