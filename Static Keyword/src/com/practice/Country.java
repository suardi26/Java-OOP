package com.practice;

public class Country {
    
    private String name;

    public void setName(String name){

        this.name = name;
    }

    public String getName(){

        return this.name;
    }

    // membuat inner class dengan keyword static.
    public static class City{

        private String name;

        public void setName(String name){

            this.name = name;
        }

        public String getName(){

            return this.name;
        }
    }

    
}
