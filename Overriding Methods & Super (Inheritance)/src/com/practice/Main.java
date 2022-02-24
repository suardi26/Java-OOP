package com.practice;

    // Method Overriding adalah Proses membuat ulang method yang diwariskan oleh super class, sehingga method tersebut dapat digunakan
    // oleh sub class dengan lebih spesifik sesuai dengan kebutuhan dari sub class itu sendiri.
    
    // Method Overriding biasanya dibuat dengan menambahkan anotasi '@Override' sebelum pembuatan method.

    // Pembuatan method Overridding dilakukan dengan menulis nama method yang sama pada nama method yang ada pada super class.
    // Sehingga method pada class super ditimpa dengan method overridding yang ada pada sub class.

    // Keyword 'this' digunakan untuk menyatakan atribut dan method yang ada didalam class tersebut.

    // Keyword 'super' digunakan untuk menyatakan attribut dan method yang diwariskan dari super class.

    // variabel hiding adalah masalah yang terjadi ketika kita membuat nama attribut pada subclass yang sama pada superclass.
    // tidak ada yang namanya attribute overridding, ketika kita membuat ulang nama atribut/variabel di subclass itu adalah variabel hiding.
    // untuk mengatasi variabel hiding dapat mengakses langsung attribut/variabel dari superclass menggunakan keyword 'super'.

    // Yang membedakan variabel hiding dan method overriding adalah ketika sebuah object di casts baik dari subclass ke superclass (UpCasting).
    // , atau dari superclass ke subclass (DownCasting). saat object di casts, method overriding akan tetap diakses dari 
    // class semula karena method overriding mengikuti objectnya bukan variabel reference yang dicasts, 
    // namun variabel akan mengakses variable yang ada di class barunya karena attribut setiap class berdiri sendiri (independent). 

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

        // 
 
        // variable hidding.
        System.out.println("Di Casting Pada tipe data Superclass 'Vehicle' Namun method override tidak berubah hanya" 
                            +" attribut/variable yang berubah karena berdiri sendiri meski memiliki nama yang sama.");
        Main.footer();
        Car vehicle3 = new Car();
        vehicle3.variableHiding = 1;
        vehicle3.variableHiding();
        System.out.println(vehicle3.variableHiding);
        Main.footer();
        System.out.println("Di casting ke tipe data superclass 'Vehicle'.");
        Main.footer();
        Vehicle vehicle4 = (Vehicle) vehicle3;
        vehicle4.variableHiding = 4;
        vehicle4.variableHiding();
        System.out.println(vehicle4.variableHiding);


    }

    public static void footer(){
        String end = "= = = = = = = = = = = = = = =";
        System.out.println(end);
    }
}
