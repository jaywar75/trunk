package com.vuluru.trunk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// The main entry point for the Spring Boot application.
// scanBasePackages is set to "com.vuluru.trunk" so that Spring finds our controllers, services, and config classes.
@SpringBootApplication(scanBasePackages = {"com.vuluru.trunk"})
public class ApexSuiteApplication {
    public static void main(String[] args) {
        SpringApplication.run(ApexSuiteApplication.class, args);
    }
}
