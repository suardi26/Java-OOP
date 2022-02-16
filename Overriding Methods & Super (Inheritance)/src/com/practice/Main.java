package com.practice;

    // Method Overriding adalah Proses membuat ulang method yang diwariskan oleh super class, sehingga method tersebut dapat digunakan
    // oleh sub class dengan lebih spesifik sesuai dengan kebutuhan dari sub class itu sendiri.
    
    // Method Overriding biasanya dibuat dengan menambahkan anotasi '@Override' sebelum pembuatan method.

    // Pembuatan method Overridding dilakukan dengan menulis nama method yang sama pada nama method yang ada pada super class.
    // Sehingga method pada class super ditimpa dengan method overriding yang ada pada sub class.

    // Keyword 'this' digunakan untuk menyatakan atribut dan method yang ada didalam class tersebut.

    // Keyword 'super' digunakan untuk menyatakan attribut dan method yang diwariskan dari super class.

public class Main {
    
    public static void main(String[] args){

        // Membuat object (Instance) dari Class Vehicle, dan mengisi nilai variabel 'brand', 'type', 'speed' dari class Vehicle.
        Vehicle vehicle1 = new Vehicle();
        vehicle1.brand = "Ford";
        vehicle1.type = "Mustang";
        vehicle1.speed = 550;
        

        // Memanggil method 'drive' dari class Vehicle dengan object 'vehicle1'. 
        vehicle1.drive();
        Main.footer();

        // Membuat object (Instance) dari Class Car.
        Car vehicle2 = new Car();
        vehicle2.brand = "Tesla";
        vehicle2.type = "T10";
        vehicle2.speed = 400;
        
        // Memanggil method overriding 'drive' dari class Car yang merupakan turunan dari class Vehicle dengan object 'vehicle2'.
        vehicle2.drive();
        Main.footer();
 
    }

    public static void footer(){
        String end = "= = = = = = = = = = = = = = =";
        System.out.println(end);
    }
}
