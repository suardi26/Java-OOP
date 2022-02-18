package com.practice;

public class Dog extends Animal {
    
    public Dog( String food, int numberOfFeet){
        super(food, numberOfFeet);

    }

    @Override
    public String move(){

        return "Anjing dapat bergerak dengan Ke-4 kakinya.";
    }

    @Override
    public void printData(){
        System.out.println("= = = = Anjing = = = =");
        super.printData();
    }
}
