package com.practice;

public class Deer extends Animal {

    public String type;
    public String deer = "Rusa";

    public Deer(String food, int numberOfFeed){

        super(food,numberOfFeed);
        type = "Karnivora";
    }

    public void printData(){
        System.out.println("= = = = = Lion = = = = =");
        System.out.println("Makanan\t\t: "+this.getFood());
        System.out.println("Jumlah Kaki\t: "+this.getNumberOfFeet());
        System.out.println("Jenis\t\t: "+this.type);
        System.out.println("= = = = = = = = = = = = = = = = = =");
    }
    public void move(){

        System.out.println("Rusa menggunakan ke-4 kakinya untuk berjalan.");
    }
}