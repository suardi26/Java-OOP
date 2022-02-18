package com.practice;

// Subclass mewarisi attribut dan method dengan modifer protected atau public yang dimiliki super classnya namun Constructor tidak diwarisi
// oleh subclass.

// namun subclass dapat memanggil Constructor superclass dengan menambahkan keyword 'super()' atau 'super(parameter1, parameter2, ...);'.

public class Main {
    
    public static void main(String[] args){

        // Membuat object (Instance) dari Class Vehicle, dan mengisi nilai variabel 'brand', 'type', 'speed' dari class Vehicle.
        Vehicle vehicle1 = new Vehicle("Tesla","T12",450);
        vehicle1.printData();

        footer();

        // Membuat object (Instance) dari Class Car.
        Car vehicle2 = new Car("Ford","Mustang",550);
        vehicle2.printData();

        footer();

        // Membuat object (Instance) dari Class Car dengan Constructor yang memiliki satu argunent.
        Car vehicle3 = new Car("Mercedez Benz");
        vehicle3.printData();
        
    }
    public static void footer(){
        String footer = "= = = = = = = = = = = = = =";

        System.out.println(footer);
    }


}

