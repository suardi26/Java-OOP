package com.practice;

public record Login (String username, String password){

    public String getUsername(){
        return this.username;
    }

    public String getPassword(){
        return this.password;
    }



}
