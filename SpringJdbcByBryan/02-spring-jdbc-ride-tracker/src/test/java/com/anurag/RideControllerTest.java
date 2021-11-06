package com.anurag;


import com.anurag.dao.Ride;
import org.junit.jupiter.api.Test;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public class RideControllerTest {

    @Test
    public void test() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<List<Ride>> response = restTemplate.exchange("http://localhost:8080/02_spring_jdbc_ride_tracker_war/rides",
                HttpMethod.GET, null, new ParameterizedTypeReference<List<Ride>>() {
                });
        List<Ride> data = response.getBody();
        System.out.println(data);
    }
}
