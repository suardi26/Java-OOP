package com.practice;

/*
- Variabel local adalah sebuah variabel yang didefinisikan didalam sebuah method, Constructor ataupun block lainnya.
variabel local akan diciptakan pada saat pemanggilan method, constructor ataupun block lainnya. varibel lokal hanya dapat
diakses pada block dimana variabel itu dideklarasikan.

- variabel instance adalah variabel non static dan dideklarasikan di dalam suatu class dan di luar dari method, constructor, dan block
lainnya. variabel instance diciptakan pada saat pembuatan object dari sebuah class. Ketika pembuatan object lebih dari satu object
maka setiap object memiliki nilai duplikatnya masing- masing dari variabel instance.

- variabel static/variabel class adalah variabel yang dideklarasikan di dalam suatu class dan di luar dari method, 
constructor, dan block lainnya, akan tetapi  variabel static dideklarasikan menggunakan keyword 'static'. tidak seperti variabel 
instance yang memiliki nilai duplikatnya masing- masing (dinamic) di setiap object yang dibuat dari suatu class , variabel static 
hanya memiliki satu duplikat (static) nilai pada setiap classnya dan berlaku untuk setiap object yang dibuat dari suatu calss. 
sehingga meskipun memiliki beberapa object namun nilai variabel static akan tetap (static) tidak dapat berubah-ubah 
pada setiap object.

*/

public class Main {
    
    
    public static void main(String[] args) {
        
        // Memanggil method static, tanpa harus membuat object (Instance) dari class Student. method ini digunakan untuk 
        // mengisi nilai variabel static 'collageName' yang nantinya digunakan di setiap object dan nilainya tidak berubah-ubah (static)
        // pada saat object di buat (instance).  
        Student.setCollageName("University Of Oxford");

         // Membuat object (Instance) dari class Student. dimana argument nantinya disimpan pada variabel instance 
         // ketika constructor di eksekusi, maka dapat dilihat bahwa nilai variabel instance dapat berubah-ubah setiap
         // object dibuat (dynamic). argmunen object 'student1' berbeda dengan object 'student2'.  
         Student student1 = new Student("Robin","London");
         Student student2 = new Student("Mike","Birmingham");

        // memanggil method non static, dan harus membuat object (Instance) dari class Student.
        student1.printData();
        
        
        // Memanggil method static.
        Main.footer();
        
        // memanggil method non static, dan harus membuat object (Instance) dari class Student.
        student2.printData(); 

    }

    private static void footer(){
        
        // variabel local
        String footer ="= = = = = = = = = = = = = = = = ";

        System.out.println(footer);
    }
}
