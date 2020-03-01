package com.mooc.meeting.film.backendeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BackendEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackendEurekaServerApplication.class, args);
    }

}
