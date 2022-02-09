package com.practice;


// class adalah wadah untuk menampung fungsi/method dan variabel (atribut/properti). 
// Penulisan nama class biasanya menggunakan format PascalCase. contohnya : class ProductList, class Product, Class Company, class FoodProduct.  

// object adalah sebuah variabel yang merupakan instance/wujud dari class. 

// class berisi definisi variabel dan fungsi yang menggambarkan sebuah object. Sama seperti benda di dunia nyata yang merupakan object misalnya
// smartphone yang memiliki atribut seperti merk, tipe, warna, dll. Serta behavior (perilaku) seperti memutar musik, mengirim pesan,
// mengambil gambar.

public class Main{

    public static void main(String[] args){
        
        // Instance/membuat object baru dari class Product. 
        Product product = new Product();

        // Mengkases atribut dari object 'product' yang merupakan wujud dari class Product sehingga atribut pada class Product seperti variabel
        // dapat diakses. 
        product.idProduct = 1001;
        product.productName = "Noodles";
        product.category = "Food";

        System.out.println("ID Product : "+product.idProduct);
        System.out.printf("Product Name : %s.\n",product.productName);
        System.out.printf("Category : %s.\n",product.category );
        System.out.println("========================");

        // Instance/membuat object baru dari class Product. 
        Product product1 = new Product();

        // Mengkases atribut dari object 'product' yang merupakan wujud dari class Product sehingga atribut pada class Product seperti variabel
        // dapat diakses. 
        product1.idProduct = 1002;
        product1.productName = "Sprite";
        product1.category = "Drink";
        System.out.println("ID Product : "+product1.idProduct);
        System.out.printf("Product Name : %s.\n",product1.productName);
        System.out.printf("Category : %s.\n",product1.category );
        System.out.println("========================");
        
        // Mengakses fungsi/method dari object 'product' yang merupakan wujud daru class Product sehingga method pada class Product dapat diakses.
        
        // memanggil fungsi/method yang mengembalikan return value pada class Product.
        System.out.println("ID Product : "+product1.getIdProduct());

        // memanggil fungsi/method yang tidak mengembalikan return value pada class Product.
        product1.printData();
    }
}