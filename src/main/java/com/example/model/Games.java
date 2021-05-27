package com.example.model;

import lombok.Data;
import org.joda.time.DateTime;

import java.sql.Date;

@Data
public class Games {
    int id;
    int user1;
    int user2;
    int winner;
    Date start_date;
    Date end_date;
}
