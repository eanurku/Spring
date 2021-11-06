package com.anurag.services;

import com.anurag.dao.Ride;

import java.util.List;

public interface RideService {
    List<Ride> getRides();

    Ride addRide(Ride ride);
}
