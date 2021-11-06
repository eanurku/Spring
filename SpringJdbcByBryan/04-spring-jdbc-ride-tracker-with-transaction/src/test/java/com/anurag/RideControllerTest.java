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
    public void testGet() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<List<Ride>> response = restTemplate.exchange("http://localhost:8080/02_spring_jdbc_ride_tracker_war/rides",
                HttpMethod.GET, null, new ParameterizedTypeReference<List<Ride>>() {
                });
        List<Ride> responseBody = response.getBody();
        System.out.println(responseBody);
    }
    @Test
    public void testPost() {
        RestTemplate restTemplate = new RestTemplate();
        Ride ride=new Ride();
        ride.setId(21);
        ride.setName("id new 21");
        ride.setDescription("this is new id");
        ResponseEntity<Ride> response = restTemplate.postForEntity("http://localhost:8080/04_spring_jdbc_ride_tracker_with_transaction_war/ride", ride, Ride.class);
        Ride responseBody = response.getBody();
        System.out.println(responseBody);
    }
}
