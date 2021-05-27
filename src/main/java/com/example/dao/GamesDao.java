package com.example.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class GamesDao {


    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public GamesDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    public int[][] field = new int[10][10];



}
