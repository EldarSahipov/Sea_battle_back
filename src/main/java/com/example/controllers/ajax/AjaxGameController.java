package com.example.controllers.ajax;

import com.example.dao.GamesDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AjaxGameController {

    @Autowired
    private GamesDao gamesDao;

    @GetMapping("/check_field/{str}")
    public int Game_Check(@PathVariable("str") String str) {
        return gamesDao.Check(str);
    }

    @GetMapping("/add")
    public int[][] add_ships() {
        return gamesDao.add_ships();
    }

}
