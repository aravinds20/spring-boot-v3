package com.aravind.spring_demo.helloWorld;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person (String name, int age, Address address) {};

record Address (String street, String city) {};

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name() {
        return "Aravind";
    }

    @Bean
    public int age() {
        return 29;
    }

    @Bean
    public Person person01() {
        return new Person(name(),age(),address01());
    }
    @Bean
    public Person person02() {
        return new Person("Robben",age(), address02());
    }
    @Bean
    public Person person03(String name, int age, @Qualifier("NewYork") Address address03) {
        return new Person(name,age, address03);
    }

    @Bean("bakerStreet")
    public Address address01() {
        return new Address("Al Favella","Bueno Aeris");
    }

//    @Primary
    @Bean
    @Primary
    public Address address02() {
        return new Address("Baker street","London");
    }
    @Bean
    @Qualifier("NewYork")
    public Address address03() {
        return new Address("Wall street","New york");
    }
}
