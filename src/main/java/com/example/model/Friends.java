package com.example.model;

import lombok.Data;


public class Friends {
    int id;
    int user1;
    int user2;
    int relation;

    public Friends(int id, int user1, int user2, int relation) {
        this.id = id;
        this.user1 = user1;
        this.user2 = user2;
        this.relation = relation;
    }

    public Friends() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser1() {
        return user1;
    }

    public void setUser1(int user1) {
        this.user1 = user1;
    }

    public int getUser2() {
        return user2;
    }

    public void setUser2(int user2) {
        this.user2 = user2;
    }

    public int getRelation() {
        return relation;
    }

    public void setRelation(int relation) {
        this.relation = relation;
    }
}
