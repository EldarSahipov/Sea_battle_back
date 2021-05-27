package com.example.game;

import lombok.Data;

@Data
public class GamePlay {

    private SeaBattle type;
    private Integer coordinatesX;
    private Integer coordinatesY;
    private String gameId;
}
