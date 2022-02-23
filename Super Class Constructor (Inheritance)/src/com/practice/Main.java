package com.practice;

// Subclass mewarisi attribut dan method dengan modifer protected atau public yang dimiliki super classnya namun Constructor tidak diwarisi
// oleh subclass.

// namun subclass dapat memanggil Constructor superclass dengan menambahkan keyword 'super()' atau 'super(parameter1, parameter2, ...);'.

// superclass constructor dapat dipanggil pada constructor yang ada pada subclassnya.

// ketika superclass membuat constructor (bukan constructor default), maka subclassnya harus membuat constructor sesuai dengan 
// parameter dari constructor superclassnya.  

// keyword 'super' juga dapat digunakan untuk memanggil atribut dan method dari superclass.

// keyword 'super' biasanya digunakan untuk memanggil method dari superclass yang telah dioverride pada subclass.

// sedangkan keyword 'this' digunakan untuk referensi dari class itu sendiri.
// keyword 'this' digunakan untuk memanggil atribut atau method pada class itu sendiri sehingga pada saat variabel class/atribut class
// memiliki nama yang sama dengan variabel local atau parameter suatu method (varible shadowing) dapat diatasi.

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

