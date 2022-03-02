package com.practice;

    // untuk membandingkan data primitif di java dapat menggunakan operator '==' sedangkan untuk non primitif menggunakan method 'equals()'.

    // method 'equals()' secara default membandingkan dua buah object secara kesamaan posisi object di memory, bukan dari isi atribut dari
    // kedua object. maka dari itu sebaiknya kita meng-override method equals yang ada pada class Object tersebut.

    // method 'HashCode' adalah method representasi integer suatu object. mirip dengan toString() yang merupakan representasi String,
    // hashCode adalah representasi integer.

    // HashCode sangat bermafaat untuk membuat struktur data unique seperti Hasmap, Set, dan lain-lain. karena cukup menggunakan method 
    // hashCode untuk mendapatkan identitas unique suatu object.

    // secara default method hashCode akan mengembalikan nilai integer sesuai data di memory, namun kita bisa mengoverride nya jika perlu.

    // Kontrak mengoverride method hashCode, karena ada kontraknya :
    // - Untuk object yang sama harus menghasilkan data integer yang sama dan jika object dipanggil berkali-kali maka data integer tidak 
    //   berubah ubah (fix).
    // - Jika ada 2 object yang sama jika dibandingkan dengan method equals, maka nilai HashCodenya juga harus sama.
    // - Tidak wajib hashCode berbeda jika method equals menghasilkan false, karena keterbatasan jumlah integer sekitar 2 milyar.

public class Main {
    
    public static void main(String[] args) {
        
        Product product1 = new Product(1001, "Oreo");
        Product product2 = new Product(1001, "Oreo");
        Product product3 = new Product(1002, "Gery");

        System.out.println("Membandingakan object 'product1' dan 'product2' dengan method 'equals()' : "+product1.equals(product2));
        System.out.println("Membandingakan object 'product1' dan 'product3' dengan method 'equals()' : "+product1.equals(product3));

        System.out.println("Nilai Hash Code pada object 'product1' : "+product1.hashCode());
        System.out.println("Nilai Hash Code pada object 'product2' : "+product2.hashCode());
        System.out.println("Nilai Hash Code pada object 'product3' : "+product3.hashCode());


        System.out.println("Membandingakan object 'product1' dan 'product2' dengan operator '==' : " + (product1.hashCode() == product2.hashCode()));
        System.out.println("Membandingakan object 'product1' dan 'product3' dengan operator '==' : " + (product1.hashCode() == product3.hashCode()));
        
        
    }
}
