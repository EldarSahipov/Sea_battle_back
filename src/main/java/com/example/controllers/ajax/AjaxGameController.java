package com.example.controllers.ajax;

import com.example.dao.GamesDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AjaxGameController {

    @Autowired
    private GamesDao gamesDao;

    @GetMapping("/check_field")
    public int Check(@RequestBody String str) {
        return gamesDao.Check(str);
    }
}
