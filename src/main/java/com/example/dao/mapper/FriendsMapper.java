package com.example.dao.mapper;


import com.example.model.Friends;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class FriendsMapper implements RowMapper<Friends> {
    @Override
    public Friends mapRow(ResultSet resultSet, int i) throws SQLException {
        Friends friends = new Friends();
        friends.setId(resultSet.getInt(1));
        friends.setUser1(resultSet.getInt(2));
        friends.setUser2(resultSet.getInt(3));
        friends.setRelation(resultSet.getInt(4));
        return friends;
    }
}
