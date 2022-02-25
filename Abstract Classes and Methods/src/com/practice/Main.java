package com.practice;

import com.shape.*;


/*

    - Keyword 'abstract' bukan access modifier, dan dapat digunakan pada class atau method.

    - class abstract adalah class yang masih dalam bentuk abstrak atau yang isinya hanya merupakan bentuk dasar class 
      yang akan di digunakan di setiap class turunannya. Karena bentuknya masih abstract maka class abstract tidak bisa digunakan secara 
      langsung untuk membuat object. namun isi dari class abstract dapat diturunkan ke sub classnya sehingga method abstrak 
      dari superclassnya dapat dibuat/diimlpementasikan menjadi konkrit atau spesifik pada subclassnya.

    - method abstract adalah method yang tidak memiliki implementasi atau tidak ada bentuk konkritnya. dengan kata lain 
      method abstract adalah method yang tidak memiliki isi dan method abstract hanya dapat digunakan pada class abstract.

    - karena tidak memiliki isi maka method abstract, wajib untuk di override di subclass artinya membuat method abstract pada superclass.
      memaksa class turunannya untuk override method abstract.

    - method abstract tidak boleh memiliki access modifier private.

    - class abstract biasanya diturunkan pada class biasa, namun class abstract juga dapat diturunkan pada class abstract.
*/

public class Main {

    public static void main(String[] args){

        // tidak bisa membuat object dari class abstract 'Shape'.
        // shape shape1 = new Shape();

        Shape circle1 = new Circle(16);
        Shape triangle1 = new Triangle(5, 6);

        //System.out.println("Luas Lingkaran adalah : "+circle1.getArea());
        System.out.printf("Luas Lingkaran adalah : %.2f.\n",circle1.getArea());
        System.out.printf("Luas Segitiga adalah : %.2f.",triangle1.getArea());
       // System.out.println("Luas Segitiga adalah : "+triangle1.getArea());


        

    }
    
}
