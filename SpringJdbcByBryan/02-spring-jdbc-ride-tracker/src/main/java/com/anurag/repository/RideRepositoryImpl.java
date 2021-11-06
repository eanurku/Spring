package com.anurag.repository;

import com.anurag.dao.Ride;
import com.anurag.dao.RideRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("rideRepository")
public class RideRepositoryImpl implements RideRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Ride> getRides() {

        List<Ride> rides=jdbcTemplate.query("select * from ride", new RideRowMapper());
        return rides;
    }
}
