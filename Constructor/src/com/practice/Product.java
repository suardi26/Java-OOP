package com.practice;

// Class dengan constructor
public class Product {

    // variabel (atribut/properti)
    int idProduct;
    String productName;
    String category;
    
    // constructor adalah sebuah method khusus yang akan dieksekusi pada saat pembuatan Object instansiasi(instance).
    // Untuk membuat constructor dapat dilakukan dengan mengambil nama class dan digunakan sebagai nama method.
    // Ini adalah Contoh Constructor, dimana nama class 'Product' digunakan juga sebagai nama method.
    public Product(int id, String name, String cat){
        idProduct = id;
        productName = name;
        category = cat;

        System.out.println("ID Product : "+idProduct);
        System.out.println("Product Name : "+productName);
        System.out.println("Category : "+category);
        System.out.println("-----------------------------");
    }
}
