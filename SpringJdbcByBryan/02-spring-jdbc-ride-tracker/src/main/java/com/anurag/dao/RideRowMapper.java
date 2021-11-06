package com.anurag.dao;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RideRowMapper implements RowMapper<Ride> {
    @Override
    public Ride mapRow(ResultSet resultSet, int i) throws SQLException {


        Ride ride=new Ride();
        ride.setName(resultSet.getString("name"));
        ride.setId(resultSet.getInt("id"));
        ride.setDescription(resultSet.getString("description"));
        return ride;
    }
}
