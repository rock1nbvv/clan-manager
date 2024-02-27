package org.example;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@Slf4j
@SpringBootApplication
@ConfigurationPropertiesScan("org.example")
public class ClanManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClanManagerApplication.class, args);

    }
}
