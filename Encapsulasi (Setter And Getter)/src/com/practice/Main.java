package com.practice;

// Encapsulation artinya memastikan data sensitif sebuah object tersembunyi dari akses luar sehingga kita bisa menjaga agar data
// sebuah object tetap baik atau valid.

// Enkapsulasi (Encapsulation) adalah cara untuk mencegah data untuk diakses dari class lain secara langsung, 
// dimana data tersebut dibungkus dengan modifier private sehingga data hanya dapat di akses hanya pada classnya. 
// dan untuk mengisi dan mengambil data tersebut dari class lain diperlukan method Setter untuk mengisi data 
// dan Getter untuk mengambil data.

// Enkapsulasi perlu dilalkukan karena : 
// 1. Untuk meningkatkan Keamanan data.
// 2. Supaya lebih muda dalam mengontrol atribut dan method suatu class.
// 3. Atribut suatu class misalnya variable dapat dibuat read-only (digunakan untuk membaca/mengambil data dengan method Getter),
//    atau write only (digunakan untuk menulis/mengisi data dengan method Setter); 
// 4. Fleksibel (Programmer dapat mengganti sebagian dari kode tanpa harus takut berdampak pada kode yang lain).   

// untuk tipe data boolean nama getter methodnya biasanya "is_ _ _()" dan setternya "set_ _ _()"
// untuk tipe data primitif nama getter methodnya biasanya "get_ _ _()" dan setternya "set_ _ _()"
// untuk Object nama getter methodnya biasanya "get_ _ _()" dan setternya "set_ _ _()" 

public class Main {
    public static void main(String[] args){
        
        // Instance/membuat object baru dari class Product dengan parameter serta langsung mengeksekusi constructor 
        // dari class Product.
        Lingkaran lingkaran1 = new Lingkaran();
        
        // Memanggil method setter dari class Lingkaran.
        lingkaran1.setDiameter(20);
        
        // Memanggil method getter dari class Lingkaran.
        double diameter = lingkaran1.getDiameter();
        System.out.println("Diameter : "+diameter);

        // Memanggil method getter dari class Lingkaran.
        double jari2 = lingkaran1.getJari2();
        System.out.println("Jari-jari : "+jari2);
        double luasLingkaran = lingkaran1.getLuasLingkaran();
        System.out.println("Luas Lingkaran : "+luasLingkaran);

        System.out.println("= = = = = = = = = = = = ");
        // dapat dilakukan validasi pada method setter.
        Lingkaran lingkaran2 = new Lingkaran();
        lingkaran2.setDiameter(25);
        System.out.println("Diameter :  "+lingkaran2.getDiameter());
        
        // tidak dapat di set 0 kerena sudah di validasi di method 'setDiameter'. 
        lingkaran2.setDiameter(0);
        System.out.println("Diameter :  "+lingkaran2.getDiameter());
    }
}
