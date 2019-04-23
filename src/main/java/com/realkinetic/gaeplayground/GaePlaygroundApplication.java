package com.realkinetic.gaeplayground;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;


@SpringBootApplication
@RestController
public class GaePlaygroundApplication {

    @Autowired
    private RandService randomService;

    public static void main(String[] args) throws IOException {
        SpringApplication.run(GaePlaygroundApplication.class, args);
    }

    @GetMapping("/")
    public String hello() {
        randomService.callUrl();
        return "Hello, " + randomService.randomInt();
    }


}

