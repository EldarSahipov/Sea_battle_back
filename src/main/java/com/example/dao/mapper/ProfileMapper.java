package com.example.dao.mapper;


import com.example.model.Profile;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProfileMapper implements RowMapper<Profile> {
    @Override
    public Profile mapRow(ResultSet resultSet, int i) throws SQLException {
        Profile profile = new Profile();
        profile.setId(resultSet.getInt(1));
        profile.setRang(resultSet.getString(2));
        profile.setMatches(resultSet.getInt(3));
        profile.setWins(resultSet.getInt(4));
        profile.setWins_streak(resultSet.getInt(5));
        profile.setUser_id(resultSet.getInt(6));
        profile.setIs_playing(resultSet.getBoolean(7));
        profile.setIs_searching(resultSet.getBoolean(8));
        return profile;
    }
}
