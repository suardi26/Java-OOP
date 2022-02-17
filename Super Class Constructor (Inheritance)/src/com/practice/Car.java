package com.practice;

public class Car extends Vehicle{
    
   public Car(String name){
        
        super(name);
   }

    public Car(String brand, String type, int speed){

        // Mengakses Constructor dari Super Class.
        super(brand, type, speed);

    }
}
