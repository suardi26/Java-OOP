package com.practice;

// Sama seperti class abstract, namun interface hanya berisi method abstract (tidak memiliki block code) dan atribut yang constant
// (nilai atribut tidak bisa diubah).

// untuk mewariskan interface dapat menggunakan keyword 'implements' bukan 'extends'.

// interface juga tidak dapat digunakan secara langsung untuk membuat object. namun isi dari interface dapat diturunkan ke sub classnya
// sehingga method abstrak dari superclassnya dapat dibuat/diimlpementasikan menjadi konkrit atau spesifik pada subclassnya. 

// default method pada interface adalah public dan abstract.

// default atribut interface adalah public static final.

// ketika mengimplement suatu interface, semua method yang ada pada interface harus dioverride pada subclassnya.

// sejak java 8 kita dapat membuat method interface yang memiliki body implementasi dengan menggunakan keyword 'default', dengan membuat
// default method maka subclass tidak wajib melakukan override. Hanya diberi Opsi apakah ingin Mengoverride atau tidak.

// Di interface tidak bisa membuat constructor.

// Sejak java 8 kita dapat membuat method static dalam interface.

// Sejak java 9 kita dapat membuat method private dalam interface.

// Di interface kita dapat menerapkan jenis multiple inheritance.

// Di java subclass hanya bisa mempunyai 1 superclass, namun berbeda dengan interface, sebuah subclass bisa implements lebih dari 1 interface.

// Interface pun dapat mewarisi satu interface bahkan lebih, dengan menggunakan keyword 'extends'. namun ketika class mewarisi sebuah 
// interface maka menggunakan keyword 'implements'.


public class Main {

    public static void main(String[] args){

        // tidak bisa membuat object atau di instansiasi langsung dari interface.
        //Car car1 = new Car();

        Car car2 = new Kijang();
        car2.setTitle();
        car2.drive();
        System.out.println("Brand Mobil : "+car2.getBrand());
        System.out.println("Jumlah Ban Mobil Kijang "+car2.getTier()+".");
        System.out.println("Harga mobil : "+car2.price());
        System.out.println("Pajak Mobil Pertahun : "+Car.tax+".");
        Car.setFooter();
       
    }
    
}
