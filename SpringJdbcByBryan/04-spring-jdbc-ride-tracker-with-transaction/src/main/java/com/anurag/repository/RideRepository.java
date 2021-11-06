package com.anurag.repository;

import com.anurag.dao.Ride;

import java.util.List;

public interface RideRepository {
    List<Ride> getRides();

    Ride addRide(Ride ride);
}
