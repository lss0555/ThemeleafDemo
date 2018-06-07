package com.example.thyemeleaf.model;

import java.io.Serializable;

public class user implements Serializable{
    private int id;
    private String username;
    private String password;

    public user(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public user() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "user{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
