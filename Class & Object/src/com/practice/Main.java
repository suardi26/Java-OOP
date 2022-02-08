package com.practice;


// class adalah wadah untuk menampung fungsi/method dan variabel (atribut/properti). 
// Penulisan nama class biasanya menggunakan format PascalCase. contohnya : class ProductList, class Product, Class Company, class FoodProduct.  

// object adalah sebuah variabel yang merupakan instance/wujud dari class. 

// class berisi definisi variabel dan fungsi yang menggambarkan sebuah object. Sama seperti benda di dunia nyata yang merupakan object misalnya
// smartphone yang memiliki atribut seperti merk, tipe, warna, dll. Serta behavior (perilaku) seperti memutar musik, mengirim pesan,
// mengambil gambar.

// Membuat Class.
class Product {
    int IdProduct;
    String productName;
    String category;
}

public class Main{

    public static void main(String[] args){
        
        // Instance/membuat object baru dari class Product. 
        Product product = new Product();

        // Mengkases atribut dari object 'product' yang merupakan wujud dari class Product sehingga atribut pada class Product seperti variabel
        // dapat diakses. 
        product.IdProduct = 1001;
        product.productName = "Noodles";
        product.category = "Food";

        System.out.println("ID Product : "+product.IdProduct);
        System.out.printf("Product Name : %s.\n",product.productName);
        System.out.printf("Category : %s.\n",product.category );
        System.out.println("========================");

        // Instance/membuat object baru dari class Product. 
        Product product1 = new Product();

        // Mengkases atribut dari object 'product' yang merupakan wujud dari class Product sehingga atribut pada class Product seperti variabel
        // dapat diakses. 
        product1.IdProduct = 1002;
        product1.productName = "Sprite";
        product1.category = "Drink";
        System.out.println("ID Product : "+product1.IdProduct);
        System.out.printf("Product Name : %s.\n",product1.productName);
        System.out.printf("Category : %s.\n",product1.category );

    }
}