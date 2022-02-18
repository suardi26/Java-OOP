package com.practice;

public class Cat extends Animal{
   
    
    public Cat(String food, int numberOfFeet){
        
        super(food, 4);
       
    }

    // overridding method dilakukan dengan menggunakan modifier yang sama atau lebih luas dari modifier dari superclassnya.
    public void printData(){

        // tidak dapat mengubah nilai dari variabel 'title' yang memiliki modifier 'final' dari superclass Animals.
        //title = "Animals";

        System.out.println(this.title);
        System.out.println("Makanan\t\t: "+this.food);
        System.out.println("Jumlah Kaki\t: "+this.numberOfFeet);
        System.out.println("Kucing Menggunakan ke-4 kakinya untuk berjalan.");
        
        System.out.println(this.footer());
        
    }

    // tidak bisa overridding method 'footer()' dari superclass 'Animals' karena method tersebut memiliki modifier 'final'.
    // public String footer(){

    //     return "Animals";
    // }


}
