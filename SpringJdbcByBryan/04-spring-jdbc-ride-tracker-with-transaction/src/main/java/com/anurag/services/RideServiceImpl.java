package com.anurag.services;

import com.anurag.dao.Ride;
import com.anurag.repository.RideRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "rideService")
public class RideServiceImpl implements RideService {

    @Autowired
    private RideRepository rideRepository;

    @Override
    public List<Ride> getRides() {
        return rideRepository.getRides();
    }

    @Override
    public Ride addRide(Ride ride) {
        return rideRepository.addRide(ride);
    }

}
