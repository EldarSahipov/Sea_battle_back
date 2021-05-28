package com.example.controllers.ajax;

import com.example.dao.UserDao;
import com.example.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AjaxController {

    @Autowired
    private UserDao userDao;

    //    Users
    @PostMapping("/add_user")
    public void addUser(@RequestBody User user) {
        userDao.addUser(user);
    }

}



