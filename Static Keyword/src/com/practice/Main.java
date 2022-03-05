package com.practice;

//import static pada class Application.

//mengakses semua attribut atau method static yang ada pada class Application.
//import static com.practice.Application.*;

//mengakses attribut static 'PROCESSORS' yang ada pada class Application.
import static com.practice.Application.PROCESSORS;

public class Main {
    
    /*
        - Keyword 'static' adalah perintah yang digunakan untuk mengakses attribute seperti variabel dan juga method 
          tanpa harus membuat suatu object (Instance) dari class.

        - Dengan penambahan keyword 'static' pada variabel dan method akan meciptakan variabel class dan method class
          bukan variabel instance dan method instance sehingga tanpa instance object, variabel dan method static dapat
          di panggil dengan bantuan nama classnya.
          
        - Keyword 'static' dapat di gunakan pada variabel, method, class bersarang (Inner Class) atau pun static block lainnya.
        
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
          
        - Keyword 'import static' pada java digunakan untuk import class dimana atribut atau method static dengan modifier public dapat
          diakses tanpa harus menuliskan nama classnya.
          
        - Block Static hanya akan dieksekusi sekali, pada saat pertama kali object dibuat dari class atau sebelum anggota/member 
          (attribute atau method) static pertama kali diakses.
         
          
    */
    public static void main(String[] args) {
        
        // memanggil method static, tanpa harus membuat object (Instance) dari class Student.
        Student.setCollageName("University Of Oxford");

        // Membuat object (Instance) dari class Student.
        Student student1 = new Student("Fernando");
        Student student2 = new Student("Marco");

        // memanggil method non static, dan harus membuat object (Instance) dari class Student.
        student1.printData();
        
        // memanggil variabel static, tanpa harus membuat object (Instance) dari class Student.
        System.out.println(Student.footer);
        
        // memanggil method non static, dan harus membuat object (Instance) dari class Student.
        student2.printData();
        
        // membuat object inner class tanpa membuat object outer class.
        Country.City city = new Country.City();
        city.setName("London");
        System.out.println("City : "+city.getName());

        // mengakses block static terlebih dahulu sebelum mengakses member pada class Application yaitu attribute 'PROCESSORS'.
        System.out.println("Jumlah Core Processor : "+Application.PROCESSORS);

        // mengakses langsung attribut PROCESSORS tanpa harus menuliskan nama classnya, karena sudah di 'import static' dari class Application.
        System.out.println("Jumlah Core Processor : "+PROCESSORS);

    }

    
}
