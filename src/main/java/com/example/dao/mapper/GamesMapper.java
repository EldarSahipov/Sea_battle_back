package com.example.dao.mapper;

import com.example.model.Games;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class GamesMapper implements RowMapper<Games> {
    @Override
    public Games mapRow(ResultSet resultSet, int i) throws SQLException {
        Games games = new Games();
        games.setId(resultSet.getInt(1));
        games.setUser1(resultSet.getInt(2));
        games.setUser2(resultSet.getInt(3));
        games.setWinner(resultSet.getInt(4));
        games.setStart_date(resultSet.getDate(5));
        games.setEnd_date(resultSet.getDate(6));
        return games;
    }



}
