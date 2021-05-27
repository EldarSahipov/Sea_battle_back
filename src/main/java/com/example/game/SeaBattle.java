package com.example.game;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum SeaBattle {
    ship1(1),
    ship2(2),
    ship3(3),
    ship4(4);

    private Integer value;
}
