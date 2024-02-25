package com.euler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GoogleJibDockerApplication {


    public static void main(String[] args) {
        SpringApplication.run(GoogleJibDockerApplication.class, args);
    }

    @GetMapping("/message")
    public String message() {
        return "Hello Google Jib for Docker.";
    }

}
