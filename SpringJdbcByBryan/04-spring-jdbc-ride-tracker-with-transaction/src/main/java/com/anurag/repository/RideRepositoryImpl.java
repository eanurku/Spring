package com.anurag.repository;

import com.anurag.dao.Ride;
import com.anurag.dao.RideRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository("rideRepository")
public class RideRepositoryImpl implements RideRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Ride> getRides() {

        List<Ride> rides = jdbcTemplate.query("select * from ride", new RideRowMapper());
        return rides;
    }

    @Override
   // @Transactional
    public Ride addRide(Ride ride) {
        jdbcTemplate.update("insert into ride(id,name,description) values(?,?,?)",
                ride.getId(), ride.getName(), ride.getDescription());

        Ride rideinserted = jdbcTemplate.queryForObject("select * from ride where id=?", new Object[]{ride.getId()}, new RideRowMapper());
        System.out.println("inserted ride from DB="+rideinserted);
        System.out.println("------rolling back DB updates-----------");
        throw new DataAccessException("DB Error") {};
        //return jdbcTemplate.queryForObject("select * from ride where id=?", new Object[]{ride.getId()}, new RideRowMapper());
    }
}
