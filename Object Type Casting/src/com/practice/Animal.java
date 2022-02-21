package com.practice;

public class Animal {
    
    private String food;
    private int numberOfFeet;

    public Animal(String food, int numberOfFeet){

        this.food = food;
        this.numberOfFeet = numberOfFeet;

    }

    // setter 
    public void setFood(String food){
        
        this.food = food;
    }
    
    // setter
    public void setNumberOfFeet(int numberOfFeet){

        this.numberOfFeet = numberOfFeet;
    }

    // getter
    public String getFood(){

        return this.food;
    }
    // getter
    public int getNumberOfFeet(){

        return this.numberOfFeet;
    }

    public void printData(){
         
        System.out.println("Ini adalah superclass binatang.");

    }

    

}
