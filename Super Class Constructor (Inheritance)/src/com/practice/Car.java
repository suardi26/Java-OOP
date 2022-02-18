package com.practice;

public class Car extends Vehicle{
    
   // membuat constructor.
   public Car(String name){
        // Mengakses Constructor dari Super Class.
        super(name);
   }

   // overloading constructor.
    public Car(String brand, String type, int speed){

        // Mengakses Constructor dari Super Class.
        super(brand, type, speed);

    }
}
