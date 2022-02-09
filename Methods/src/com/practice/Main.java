package com.practice;


// class adalah wadah untuk menampung fungsi/method dan variabel (atribut/properti). 
// Penulisan nama class biasanya menggunakan format PascalCase. contohnya : class ProductList, class Product, Class Company, class FoodProduct.  

// object adalah sebuah variabel yang merupakan instance/wujud dari class. 

// class berisi definisi variabel dan fungsi yang menggambarkan sebuah object. Sama seperti benda di dunia nyata yang merupakan object misalnya
// smartphone yang memiliki atribut seperti merk, tipe, warna, dll. Serta behavior (perilaku) seperti memutar musik, mengirim pesan,
// mengambil gambar.

public class Main{

    public static void main(String[] args){
        System.out.println("= = = = = = = = = = = = = = = = = = = = Methods = = = = = = = = = = = = = = = = = = = = =");
        // Instance/membuat object baru dari class Product dengan parameter serta langsung mengeksekusi constructor dari class Product.
        Product product = new Product(1001,"Nutri Sari");
        
        // Mengkases atribut dan method dari object 'product' yang merupakan wujud dari class Product sehingga method 
        // dan atribut pada class Product seperti variabel dapat diakses.
        
        // Mengakses method (tanpa return value dan tanpa parameter) dari class Product.
        System.out.println("Mengakses method (tanpa return value dan tanpa parameter) dari class Product.");
        product.printData();
        System.out.println("=============================="); 

        // Mengakses method (dengan parameter dan tanpa return value) dari class Product.
        System.out.println("Mengakses method (dengan parameter dan tanpa return value) dari class Product.");
        product.setId(1002);
        product.setName("Aqua");
        System.out.println("ID Produk : "+product.idProduct);
        System.out.println("Nama Produk : "+product.productName);
        System.out.println("==============================");
        
        // Mengakses method (dengan return value dan tanpa parameter) dari class Product.
        System.out.println("Mengakses method (dengan return value dan tanpa parameter) dari class Product.");
        System.out.println("ID Produk : "+product.getId());
        System.out.println("Nama Produk : "+product.getName());
        System.out.println("==============================");
        
        // Mengakses method (dengan return value dan dengan parameter) dari class Product.
        System.out.println("Mengakses method (dengan return value dan dengan parameter) dari class Product.");
        String value = product.GetAndPrint(1003,"Bear Brand");
        System.out.println(value);
        System.out.println("==============================");
    }
}