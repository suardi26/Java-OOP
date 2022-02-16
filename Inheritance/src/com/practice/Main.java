package com.practice;

/*
    - Inheritance adalah proses mewariskan attribut dan method dari parent class ke child class.
    - Class yang mewariskan method dan atributnya disebut(super class, parent class, base class).
    - Class yang mewarisi method dan atribut dari super class disebut (sub class, child class, derived class).
    - Untuk dapat mewarisi atribut dan method dari super class maka dapat menggunakan keyword 'extends'.

*/
public class Main {
    
    public static void main(String[] args) {
        
        // Membuat object (Instance) dari Class Vehicle, dan mengisi nilai variabel 'brand', 'type', 'speed' dari class Vehicle.
        Vehicle vehicle1 = new Vehicle();
        vehicle1.brand = "Toyota";
        vehicle1.type = "Avanza";
        vehicle1.speed = 360;

        // Memanggil method 'drive' dari class Vehicle dengan object 'vehicle1'. 
        vehicle1.drive();

        Main.footer();

        // Membuat object (Instance) dari class Motorcycle, meskipun class Motorcycle kosong namun dengan menambahkan keywords 'extends' 
        // dan class Vehicle, maka class Motorcycle adalah class turunan dari Vehicle, sehingga class Motorcycle dapat mewarisi 
        // atribut atau method yang ada pada super classnya yaitu class Vehicle, dengan kata lain class Motorcycle dapat mengakses attribut
        // atau method yang ada pada class Vehicle.
        Motorcycle vehicle2 = new Motorcycle();
        vehicle2.brand = "Kawasaki";
        vehicle2.type = "ZX-25R";
        vehicle2.speed = 250;

        // Memanggil method 'drive' dari class Motorcycle yang merupakan turunan dari class Vehicle dengan object 'vehicle2'.
        vehicle2.drive();
        Main.footer();

        // Membuat object (Instance) dari class Car, meskipun class Car kosong namun dengan menambahkan keywords 'extends' 
        // dan class Vehicle, maka class Car adalah class turunan dari Vehicle, sehingga class Car dapat mewarisi 
        // atribut atau method yang ada pada super classnya yaitu class Vehicle, dengan kata lain class Car dapat mengakses attribut
        // atau method yang ada pada class Vehicle.
        Car vehicle3 = new Car();
        vehicle3.brand = "Mercedes Benz";
        vehicle3.type = "OH-2542";
        vehicle3.speed = 500;

         // Memanggil method 'drive' dari class Car yang merupakan turunan dari class Vehicle dengan object 'vehicle3'.
        vehicle3.drive();
        Main.footer();
        
        
    }

    public static void footer(){
        String end = "= = = = = = = = = = = = = = =";
        System.out.println(end);
    }
}

