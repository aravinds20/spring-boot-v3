package com.aravind.spring_demo.c1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MongoDbDataService implements DataService {
  public int[] retriveData() {
    return new int[] {11,12,13,14,15,15,16,17,18,19};
  }
}