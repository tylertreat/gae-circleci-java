package com.realkinetic.gaeplayground;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Random;

@Component
public class RandService {

    private final RestTemplate restTemplate;

    public RandService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public int randomInt() {
        System.out.println("randInt()");
        Random rand = new Random();
        return rand.nextInt();
    }

    public String callUrl() {
        ResponseEntity<String> response = restTemplate.getForEntity("https://realkinetic.com", String.class);
        return response.getBody();
    }

}
