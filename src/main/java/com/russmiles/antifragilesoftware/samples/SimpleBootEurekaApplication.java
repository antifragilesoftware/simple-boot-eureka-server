package com.russmiles.antifragilesoftware.samples;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SimpleBootEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleBootEurekaApplication.class, args);
    }
}
