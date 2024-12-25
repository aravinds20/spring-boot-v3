package com.aravind.spring_demo.exercise;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class CalculatorService {

  private DataService dataService;

  public CalculatorService(@Qualifier("MySQL") DataService dataService) {
    this.dataService = dataService;
  }

  public int findMax() {
    return Arrays.stream(dataService.retriveData()).max().orElse(0);
  }

}

//@Configuration
@RequiredArgsConstructor
@ComponentScan
public class BusinessCalculatorService {

  private CalculatorService calculatorService;

  public static void main(String[] args) {
    var context = new AnnotationConfigApplicationContext(BusinessCalculatorService.class);
    System.out.println(context.getBean(CalculatorService.class).findMax());
  }

}