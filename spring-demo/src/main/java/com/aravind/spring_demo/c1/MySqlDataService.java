package com.aravind.spring_demo.c1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("MySQL")
public class MySqlDataService implements DataService {
  public int[] retriveData() {
    return new int[] {1,2,3,4,5,5,6,7,8,9};
  }
}
