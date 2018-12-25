package com.example.application.ticonfig.integrationTest;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.application.ticonfig.Greeting;

public class GreetingTestIT extends AbstractTestIntegration {

  @Autowired
  private Greeting greeting;

  @Test
  public void test() {
    String greetingResult = greeting.greet();
    assertThat(greetingResult).isEqualTo("Hello itname");
  }

}
