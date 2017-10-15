package com.ovnc.coffeeservice.v1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/coffees")
@EnableEurekaClient
public class CoffeeServiceApplication {

    private static Logger logger = LoggerFactory.getLogger(CoffeeServiceApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(CoffeeServiceApplication.class, args);
    }

    @RequestMapping("/ping")
    String ping(){
        logger.info("ping");
        return "pong";
    }
}
