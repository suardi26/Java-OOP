package com.practice;

import javax.sound.sampled.SourceDataLine;

// Dengan menambahkan keyword 'extends' dan class Vehicle maka class Car adalah class turunan dari class Vehicle.
public class Car extends Vehicle {
    
    String brand  = super.brand;
    String type = super.type;
    int speed = super.speed;

    // Membuat method overriding 'drive', dari super class Vehicle.
    @Override
    public void drive(){

        // Mengakses Method pada super class (CLass Vehicle).
        String title1 = super.info();
        
        // Mengakses Method pada class ini.
        String title2 = this.info();

        System.out.println(title1+" "+title2);
        System.out.println("Brand\t: "+this.brand);
        System.out.println("Type\t: "+this.type);
        System.out.println("Speed\t: "+this.speed +" km/j.");
    }

    // Membuat method overriding 'drive', dari super class Vehicle.
    @Override
    public String info(){

        String title = "(Mobil)";

        return title;
    }

}
