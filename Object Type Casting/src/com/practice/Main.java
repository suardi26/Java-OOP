package com.practice;

/*   
    - Casting variabel reference adalah mengubah variabel reference pada suatu object baik itu dari superclass ke subclass (Downcasting)
      atau dari subclass ke superclass(Upcasting).

    - Casting tipe data primtif dengan casting tipe reference terlihat sama namun kedua konsep tersebut sangat berbeda.
      misalnya membuat casting variabel :

        double number1 = 2.5;
        int number2 = number1;
        
      maka dari contoh diatas nilai int adalah 2 dan tidak dapat dikembalikan menjadi 2.5 lagi.

    - Namun casting variabel reference berbeda, variabel reference mengacu ke object aritinya object dibuat berdasarkan referensi dari 
      class tertentu, namun variabel referance tidak berisi object itu sendiri.

    - Casting referensi variabel tidak berisi object yang dirujuknya, namun hanya melabeli object tersebut dengan kata lain memperluas 
      daftar atribut dan method yang dapat digunakan pada object ini (Downcasting), atau mempersempit daftar atribut dan method 
      yang dapat digunakan pada object ini (Upcasting).  

    - Upcasting adalah casting variabel reference dari subclass ke superclass.

    - Downcasting adalah casting variabel reference dari superclass ke subclass.

    - Casting tipe data primtif ada dua tipe yaitu casting implisit dan eksplisit 

        - Casting implisit adalah casting yang dilakukan tanpa adanya kode tambahan. casting implisit digunakan untuk merubah 
          tipe data suatu nilai, dari tipe data yang berkapasitas kecil ke tipe data yang berkapasitas besar. seprti :
          
          int number1 = 5;
          long number2 = number1;

        - Casting eksplisit adalah casting yang dilakukan ketika kita ingin merubah type data suatu nilai. dari tipe data yang
          berkapasitas besar ke tipe data yang berkapasitas kecil atau type data yang memiliki nilai bilangan desimal ke tipe 
          data yang memiliki nilai bilangan bulat. seperti
          
          int number3 = 6;
          byte number4 = (byte) number3;
          //
          double number5 = 5.0;
          int number6 = (int) number5;

          perlu diingat untuk mengubah tipe data dari yang berkapasitas besar ke tipe data yang berkapasitas kecil dapat merubah nilainya
          ketika nilai yang dicasting di luar dari kapasitas tipe data. 

*/

public class Main {

    public static void main(String[] args){

        // Membuat object dari class Lion.
        Lion animal_lions1 = new Lion("Daging",4);
        animal_lions1.printData();
        animal_lions1.move();

        // up casting.
        Animal animal = (Animal) animal_lions1;
        animal.printData();
        

        // ketika attribut atau method tidak diturunkan dari super class maka method tersebut tidak bisa dipanggil ketika sudah dilakukan 
        // up casting.
        // System.out.println(animal.type);
        // animal.move();

        // down casting tidak dapat dilakukan secara langsung ketika variabel reference class nya adalah subclass dan objectnya juga dari
        // subclassnya.
        // Deer animal_deer1 = (Deer) animal;
        // animal_deer1.printData();


        // Down casting dengan variabel reference superclass dan object dari subclass dapat dilakukan.
        // sehingga dapat mengakses method & atribut pada subclassnya.
        Animal animal2 = new Deer("Rumput",4);
        animal2.printData();
        
        // ketika langsung memanggil method 'move()' dari subclass Deer maka akan error karena method 'move()' tidak diturunkan dari 
        // superclassnya sehingga harus melakukan downcasting. 

        // animal2.move();
        // System.out.println("Hewan "+animal2.deer+".");
        System.out.println("Hewan "+((Deer)animal2).deer+".");
        ((Deer)animal2).move();
        
       

        // Down casting (mengembalikan object yang telah di up casting). 
        Lion animal_lions2 = (Lion) animal;
        animal_lions2.printData(); 

        
       
    }
    
}
