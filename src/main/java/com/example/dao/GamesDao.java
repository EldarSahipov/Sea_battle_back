package com.example.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class GamesDao {


    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public GamesDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

 public int Check (String str)
 {
     int conclusion;
     int[][] enemys_playing_field = new int[10][10];
     enemys_playing_field[0][0] = 1;
     enemys_playing_field[0][1] = 0;

     int i,j;
     i = Character.getNumericValue(str.charAt(0));
     j = Character.getNumericValue(str.charAt(2));

     if (enemys_playing_field[i][j] == 1)
     {
         conclusion = 1;
         return conclusion;
     }
     else{
         conclusion = 0;
         return conclusion;
     }
 }




}
