package com.safemtech.harshicorpconsulspringbootdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RefreshScope
public class HarshicorpConsulSpringbootDemoApplication {

    @Value("${message}")
    private String greeting;

    public static void main(String[] args) {
        SpringApplication.run(HarshicorpConsulSpringbootDemoApplication.class, args);
    }

    @GetMapping("/greet")
    public String greet(@RequestParam String name){
        return String.format("%s %s", greeting, name);
    }

}
