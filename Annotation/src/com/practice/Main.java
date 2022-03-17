package com.practice;

/*
   - Annotation merupakan suatu tag untuk memberikan informasi pada suatu code yang dibuat.
   - Annotation merupakan penambahan metadata ke kode program yang kita buat.
   - Annotation biasanya digunakan untuk membuat library/framework.
   - Annotation dapat diakeses menggunakan reflection.
   - Pada saat ingin membuat Annotation, dapat menggunakan keyword @interface.
   - Annotation memiliki method dengan tipe data sederhana, dan bisa memiliki default value.
   - Attribute Annotation :
        - @Target => digunakan untuk menginformasikan annotation dapat digunakan pada class, method, field, dll.
          @Target memiliki value array atau memiliki nilai lebih dari satu.
        - @Retention => digunakan untuk menginformasikan bahwa annotation disimpan di hasil kompilasi, dan apakah bisa dibaca oleh
          reflection ?. @Retention hanya memiliki satu value.
   - Beberapa contoh Annotation yang disediakan oleh java. seperti :
        - @Override digunakan untuk menandai bahwa suatu method mengoverride method dari superclassnya.
        - @Deprecated digunakan untuk menandai bahwa method tersebut tidak direkomendasikan lagi untuk digunakan.
        - @FunctionalInterface, untuk menandai bahwa class tersebut bisa dibuat sebagai lamda expression.
        - dll.
*/

// menambahkan annotation pada class karena salah satu targetnya adalah ElementType.TYPE,
// dimana ElementType.TYPE dapat berlaku pada Class, interface (including annotation interface), enum, or record declaration.
@Checked(name = "Suardi")
public class Main {

    // menambahkan annotation pada method karena salah satu targetnya adalah ElementType.METHOD,
    // dimana ElementType.METHOD dapat berlaku pada method.
    @Checked(name = "Suardi",tags = {"Java","Apps"})
    public static void main(String[] args) {

    }
}
