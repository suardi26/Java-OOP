package com.practice;

public class Animal {
    
    
    public String food;
    public int numberOfFeet;

    public Animal( String food, int numberOfFeet){

        
        this.food = food;
        this.numberOfFeet = numberOfFeet;
        
    }

    public String move(){

        return "Animals dapat bergerak sesuai dengan karakteristik mereka masing-masing.";
    }

    public void printData(){
        
        System.out.println("Makanan\t\t: "+this.food);
        System.out.println("Jumlah Kaki\t: "+this.numberOfFeet);
        System.out.println(move());
        System.out.println("= = = = = = = = = = = = = = = = = =");
    }

    

   
   
}
