package com.example.application.ticonfig.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.example.application.ticonfig.Greeting;

@Configuration
public class TiConfigConfiguration {

  @Bean
  public Greeting greeting() {
    return new Greeting();
  }

}
