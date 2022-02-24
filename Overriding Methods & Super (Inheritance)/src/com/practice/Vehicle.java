package com.practice;

// class vehicle merupakan super class.
public class Vehicle {
    
    public String brand;
    public String type;
    public int speed;

    public int variableHiding;
    
    
    public void drive(){

        System.out.println(this.brand+" "+this.type+" dapat Melaju Dengan Kecepatan "+this.speed+" km/j.");
        
    }

    public String info(){

        String title = "Kendaraan";

        return title;
    }

    public void variableHiding(){

        System.out.println("variable from superclass 'vehicle'.");
    }
}
