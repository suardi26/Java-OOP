package com.practice;

public class Hawk extends Animal {

    public Hawk(String food, int numberOfFeet){

        super(food, numberOfFeet);
    }

    @Override
    public String move(){

        return "Elang menggunakan kedua sayapnya untuk terbang.";
    }

    @Override
    public void printData(){
        System.out.println("= = = = Elang = = = =");
        super.printData();
    }
    
     // membuat method yang bukan turunan method dari suuper class Animal.
     public void info(){
        System.out.println("Elang merupakan Hewan Predator.");
    }
    
}
