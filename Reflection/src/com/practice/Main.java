package com.practice;

import java.lang.reflect.Field;

/*
    - Reflection adalah kemampuan melihat struktur aplikasi pada saat berjalan.
    - Reflection memungkinkan kita memeriksa/melihat serta memodifikasi atribut dari class pada saat runtime.
    - Reflection tidak hanya digunakan untuk memeriksa/melihat informasi dari class saja, namun dapat juga digunakan untuk memeriksa
      informasi dari interface, fields, serta method pada saat runtime.
    - Reflection biasanya sangat berguna pada saat kita membuat library ataupun framework, sehingga bisa meng-otomatisasi pekerjaan.
    - Untuk mengakses reflection class dari sebuah object, kita bisa menggunakan method getClass() yang merupakan
      bawaan dari class object atau namaClass.class.
    - Method getClass mengembalikan representasi class atau infoermasi pada class pada saat runtime dari sebuah object.
*/
public class Main {
    public static void main(String[] args) {

        LoginUserRequest login1 = new LoginUserRequest();
        login1.setUsername("Stve123");
        login1.setPwd("Stve123");
        login1.setLevel("Admin");
        Main.validationReflection(login1);
        System.out.println("End Of Program");
    }

    public static void validationReflection(Object object){
        Class aClass = object.getClass();

        // untuk mengambil semua fields yang ada pada class baik itu private sampai public dapat menggunakan method 'getDeclaredFields()'.
        // namun untuk mengambil fields yang memiliki modifier public saja maka dapat menggunakan method 'getFields()'.
        Field[] fields = aClass.getDeclaredFields();

        for (Field field : fields){
            // Ketika field memiliki modifier private maka tidak dapat diakses dari luar classnya namun dapat dipaksa menggunakan
            // Method 'setAccessible()' dan diset menjadi true.
            field.setAccessible(true);

            if(field.getAnnotation(NotBlank.class) != null ){

                // validation
                try {
                    String attribut = (String) field.get(object);
                    if(attribut == null || attribut.isBlank()){
                        throw new RuntimeException("Fields "+field.getName() +" is Blank.");
                    }
                }catch(IllegalAccessException exception){
                    System.out.println("Tidak dapat mengakses Fields "+field.getName());
                }
            }

        }
    }
}
