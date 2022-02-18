package com.practice;

public class Cat extends Animal{

    public Cat(String food, int numberOfFeet){
        super(food, numberOfFeet);

    }

    @Override
    public String move(){

        return "Kucing dapat bergerak dengan Ke-4 kakinya.";
    }

    @Override
    public void printData(){
        System.out.println("= = = = Kucing = = = =");
        super.printData();
    }
    
}
