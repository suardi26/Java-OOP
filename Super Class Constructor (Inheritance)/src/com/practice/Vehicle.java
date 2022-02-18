package com.practice;

public class Vehicle {
    
    public String brand;
    public String type;
    public int speed;

    // Membuat constructor.
    public Vehicle(String brand){
        this.brand = brand;
    }

    // Overloading constructor.
    public Vehicle( String brand, String type, int speed){
        
        this.brand = brand;
        this.type = type;
        this.speed = speed;
    }

    public void printData(){
        
        if(this.brand != null && this.type != null && this.speed != 0){
            System.out.println("Brand\t: "+this.brand);
            System.out.println("Type\t: "+this.type);
            System.out.println("Speed\t: "+this.speed +" km/j.");
        }else{
            System.out.println("Brand\t: "+this.brand);
            System.out.println("Type\t: -");
            System.out.println("Speed\t: -");
        }

       
    }
}
