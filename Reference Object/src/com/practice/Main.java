package com.practice;

public class Main {
    public static void main(String[] args){
        // Instance/membuat object baru dari class Product dengan parameter serta langsung mengeksekusi constructor dari class Product.
        Product product1 = new Product(1001,"Dettol");
        product1.printData();

        //  Menampilkan Address Reference/Memory dari object
        String stringProduct1 = Integer.toHexString(System.identityHashCode(product1));
        System.out.println("Address Memory Object 'product1' : "+stringProduct1);
        System.out.println("= = = = = = = = = = = = = = = = = = = = =");
        
        // Assignment Object
        // Meskipun membuat variabel object baru namun ketika mengisi variabel object 'product2' dengan variabel object
        // 'product1', hal ini menyababkan tidak terdapat address memory baru pada variabel object 'product2' melainkan 
        // mengakses address memory dari variabel object 'pruduct1' sehingga address variabel object 'product2' memiliki
        // address yang sama dengan address variabel object 'product1'.
        
        Product product2 = product1;
        product1.printData();
        
        // Menampilkan Address Reference/Memory dari object
        String stringProduct2 = Integer.toHexString(System.identityHashCode(product2));
        System.out.println("Address Memory Object 'product2' : "+stringProduct2);
        System.out.println("= = = = = = = = = = = = = = = = = = = = =");

        // Karena address variabel object 'product2' memiliki address yang sama dengan address variabel object 'product1'.
        // Sehingga ketika salah satu dari object 'product1' atau 'product2' diupdate atrributnya maka kedua attribut  
        // pada kedua object tersebut akan berubah.
        product2.productName = "Lux"; 
        System.out.println("Ketika atribut 'prductName' pada Object 'product2' diUpdate, maka atribut 'prductName' "
                            + "pada Object 'product1' akan berubah");
        System.out.println("Object 'product1' : ");
        product1.printData();
        System.out.println("= = = = = = = = = = = = = = = = = = = = =");
        System.out.println("Object 'product2' : ");
        product2.printData();
        System.out.println("= = = = = = = = = = = = = = = = = = = = =");

       // Memanggil method dengan argument Object pada Class 'Product'.
        function("'product2'",product2);
        System.out.println("= = = = = = = = = = = = = = = = = = = = =");
        System.out.println("Object 'product1' : ");
        product1.printData();
        System.out.println("= = = = = = = = = = = = = = = = = = = = =");
        System.out.println("Object 'product2' : ");
        product2.printData();
        System.out.println("= = = = = = = = = = = = = = = = = = = = =");
    }

    // Membuat method dengan parameter variabel Object dari class 'Product'.
    public static void function(String namaObject, Product product){
        String stringProduct = Integer.toHexString(System.identityHashCode(product));
        System.out.println("Address Memory Object "+namaObject+" yang dipanggil dari dalam fungsi : "+stringProduct);
        product.productName = "Pantene";
    }

}
