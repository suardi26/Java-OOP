package com.practice;

public class Main {
    
    /*
        - Keyword 'static' adalah perintah yang digunakan untuk mengakses attribute seperti variabel dan juga method 
          tanpa harus membuat suatu object (Instance) dari class.

        - Dengan penambahan keyword 'static' pada variabel dan method akan meciptakan variabel class dan method class
          bukan variabel instance dan method instance sehingga tanpa instance object, variabel dan method static dapat
          di panggil dengan bantuan nama classnya.
          
        - Keyword 'static' dapat di gunakan pada variabel, method, blok, dan class bersarang.
        
        - variabel static/variabel class adalah variabel yang dideklarasikan di dalam suatu class dan di luar dari method, 
          constructor, dan block lainnya, akan tetapi  variabel static dideklarasikan menggunakan keyword 'static'. tidak seperti variabel 
          instance yang memiliki nilai duplikatnya masing- masing (dinamic) di setiap object yang dibuat dari suatu class , variabel static 
          hanya memiliki satu duplikat (static) nilai pada setiap classnya dan berlaku untuk setiap object yang dibuat dari suatu calss. 
          sehingga meskipun memiliki beberapa object namun nilai variabel static akan tetap (static) tidak dapat berubah-ubah 
          pada setiap object.

        - dikarenakan suatu nilai variabel static bernilai tetap, maka variabel static dapat digunakan untuk atribut yang umum 
          pada setiap object yang akan dibuat. misalnya pada class mahasiswa, seluruh mahasiswa memiliki nama perguruan tinggi yang sama,
          maka dapat membuat variabel static dengan nama 'namaPerguruanTinggi'.
          
        - sama halnya dengan variabel static, method static juga dapat diakses tanpa membuat sebuah object dari sebuah class.
          untuk membuat method static cukup dengan menambahkan keyword 'static'. contoh method static yang sering digunakan adalah 'main()'.
          
        -  method yang dideklarasikan sebagai static memiliki beberapa aturan seperti :

            - Method 'static' hanya dapat mengakses secara langsung variabel atau method static lainnya dan 
              untuk variabel dan method non static dapat diakses menggunakan pembuatan object (instance).

            - variabel atau method static tidak dapat digabungkan dengan keyword 'this' atau 'super'.
          
        - Method 'static' hanya dapat mengakses secara langsung variabel atau method static lainnya dan 
          untuk variabel dan method non static dapat diakses menggunakan pembuatan object (instance). 
          namun method 'non static' dapat mengakses variabel dan method non static dan static pada class yang sama.
          dan method 'non static' hanya dapat mengakses variabel dan method static ketika berada pada class yang berbeda,
          dan untuk mengakses variabel dan method non static dari method non static lainnya pada class yang berbeda dapat 
          menggunakan pembuatan object (instance).
          
          ===
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
    public static void main(String[] args) {
        
        // memanggil method static, tanpa harus membuat object (Instance) dari class Student.
        Student.setCollageName("University Of Oxford");

        Student student1 = new Student("Fernando");
        Student student2 = new Student("Marco");

        // memanggil method non static, dan harus membuat object (Instance) dari class Student.
        student1.printData();
        
        // memanggil variabel static, tanpa harus membuat object (Instance) dari class Student.
        System.out.println(Student.footer);
        
        // memanggil method non static, dan harus membuat object (Instance) dari class Student.
        student2.printData();
        

    }

    
}
