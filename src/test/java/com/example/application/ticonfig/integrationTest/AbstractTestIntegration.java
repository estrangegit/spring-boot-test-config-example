package com.example.application.ticonfig.integrationTest;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import com.example.application.ticonfig.configuration.TiConfigConfiguration;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {TiConfigConfiguration.class})
@ActiveProfiles("integration")
@Profile("integration")
@SpringBootTest
public class AbstractTestIntegration {

}
