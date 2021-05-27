package com.example.game;

import lombok.Data;

@Data
public class Game {
    private int gameId;
    private Player player1;
    private Player player2;
    private GameStatus status;
    private int [][] board;
    private SeaBattle winner;
}
