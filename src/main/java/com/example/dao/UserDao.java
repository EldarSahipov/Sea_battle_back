package com.example.dao;

import com.example.model.User;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserDao {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public UserDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void addUser(User user) {
        jdbcTemplate.update("INSERT INTO users VALUES(default ,?,?,?,?,?,?,?,?)",
                user.getRole(), user.getLogin(), user.getPassword(),
                user.getNickname(), user.getRegist_date(), user.getExpire_date(),
                user.getIs_deleted(), user.getIs_banned());
    }

    public List<User> showUsers() {
        return jdbcTemplate.query("SELECT * FROM users", new BeanPropertyRowMapper<>(User.class));
    }

    public User updateUser(User updateUser) {
        jdbcTemplate.update("UPDATE users SET role=?, login=?, password=?," +
        " nickname=?, regist_date=?, expire_date=? is_deleted=?, is_banned=? WHERE id=?",
        updateUser.getRole(), updateUser.getLogin(), updateUser.getPassword(),
        updateUser.getNickname(), updateUser.getRegist_date(), updateUser.getExpire_date(),
        updateUser.getIs_deleted(), updateUser.getIs_banned());
        return updateUser;
    }
}
