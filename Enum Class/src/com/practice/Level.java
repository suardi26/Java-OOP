package com.practice;

public enum Level {
    
    EASY("Easy Level"),
    MEDIUM("Medium Level"),
    HARD("Hard Level");
   
    private String description;

    Level(String description){

        this.description = description;
    }

    public String getDescription(){

        return this.description;
    }
}
