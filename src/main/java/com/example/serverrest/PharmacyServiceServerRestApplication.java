package com.example.serverrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan("com.example.serverrest.config")
public class PharmacyServiceServerRestApplication {

    public static void main(String[] args) {
        SpringApplication.run(PharmacyServiceServerRestApplication.class, args);
    }

}
