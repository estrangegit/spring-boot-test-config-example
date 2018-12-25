package com.example.application.ticonfig.unitTest;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import com.example.application.ticonfig.Greeting;
import com.example.application.ticonfig.configuration.TiConfigConfiguration;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {TiConfigConfiguration.class})
@SpringBootTest
public class GreetingTest {

  @Autowired
  private Greeting greeting;

  @Before
  public void setUp() throws Exception {}

  @Test
  public void test() {
    String greetingResult = greeting.greet();
    assertThat(greetingResult).isEqualTo("Hello utname");
  }

}
