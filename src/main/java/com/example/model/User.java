package com.example.model;

import lombok.Data;
import org.joda.time.DateTime;

import java.sql.Date;

@Data
public class User {
    int id;
    int role;
    String login;
    String password;
    String nickname;
    Date regist_date;
    Date expire_date;
    Date is_deleted;
    Date is_banned;
}
