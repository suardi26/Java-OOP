package com.practice;

public class Animal {

    public String food;
    public int numberOfFeet;
    final String title = "= = = = = = Animal = = = = = =";
    

    public Animal( String food, int numberOfFeet){

        
        this.food = food;
        this.numberOfFeet = numberOfFeet;
        
    }

    void printData(){
        
        System.out.println("Makanan\t\t: "+this.food);
        System.out.println("Jumlah Kaki\t: "+this.numberOfFeet);

        // tidak dapat mengubah nilai dari variabel 'title' yang memiliki modifier 'final'.
        //title = "Animals";

        System.out.println(footer());
       
    }

    public final String footer(){

        return "= = = = = = Footer = = = = = =";
    }

    // dapat melakukan overload method 'footer' dengan modifier 'final'.
    
    public String footer(String footer){

        return "= = = = = = "+footer+" = = = = = =";
    }

}
    
