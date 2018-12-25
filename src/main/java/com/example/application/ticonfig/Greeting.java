package com.example.application.ticonfig;

import org.springframework.beans.factory.annotation.Value;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Greeting {

  @Value("${ti.config.ut.name}")
  private String name;

  public String greet() {
    String greetStr = "Hello " + name;
    log.info(greetStr);
    return greetStr;
  }

}
