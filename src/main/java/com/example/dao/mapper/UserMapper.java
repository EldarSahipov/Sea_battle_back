package com.example.dao.mapper;

import com.example.model.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserMapper implements RowMapper<User> {
    @Override
    public User mapRow(ResultSet resultSet, int i) throws SQLException {
        User user = new User();
        user.setId(resultSet.getInt(1));
        user.setRole(resultSet.getInt(2));
        user.setLogin(resultSet.getString(3));
        user.setPassword(resultSet.getString(4));
        user.setNickname(resultSet.getString(5));
        user.setRegist_date(resultSet.getDate(6));
        user.setExpire_date(resultSet.getDate(7));
        user.setIs_deleted(resultSet.getDate(8));
        user.setIs_banned(resultSet.getDate(9));
        return user;
    }

}
