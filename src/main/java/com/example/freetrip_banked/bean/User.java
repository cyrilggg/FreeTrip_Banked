package com.example.freetrip_banked.bean;

public class User {
    /**用户ID*/
    private int id;
    /**用户名*/
    private String username;
    /**用户密码*/
    private String password;
    public User(){
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
}
