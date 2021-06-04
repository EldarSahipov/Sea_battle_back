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

    @GetMapping("/add/{id}")
    public int[][] add_ships(@PathVariable ("id") int id) {
        return gamesDao.add_ships(id);
    }

    @GetMapping("/search_game/{id}")
    public int[] Id_gamers(@PathVariable ("id") int id) {
        return gamesDao.Id_gamers(id);
    }

    @GetMapping("/game_start/{id}")
    public int Game_Start(@PathVariable ("id") int id) {
        return gamesDao.Game_Start(id);
    }


}
