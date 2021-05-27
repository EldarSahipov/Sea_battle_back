package com.example.model;

import lombok.Data;

@Data
public class Profile {
    int id;
    String rang;
    int matches;
    int wins;
    int wins_streak;
    int user_id;
    boolean is_playing;
    boolean is_searching;

    public boolean isIs_playing() {
        return is_playing;
    }

    public void setIs_playing(boolean is_playing) {
        this.is_playing = is_playing;
    }

    public boolean isIs_searching() {
        return is_searching;
    }

    public void setIs_searching(boolean is_searching) {
        this.is_searching = is_searching;
    }
}
