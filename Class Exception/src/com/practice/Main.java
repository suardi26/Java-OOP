package com.practice;

/*
    - Exception terbagi menjadi 3 yaitu : Checked Exception, Runtime Exception, Error.

    - Checked Exception wajib menggunakan try-catch expression.

    - Runtime Exception adalah jenis exception tidak wajib menggunakan try-catch expression.

    - Pada saat menggunakan Checked Exception pada sebuah method maka wajib menambahkan keyword 'throws' dan nama class exception.

    - Compiler java tidak mendeteksi error walaupun kita tidak menggunakan try-cacth expression, pada saat memanggil method
      yang menambahkan runtime exception serta di method tidak wajib menambahkan keyword 'throws' dan class runtime exception
      jika jenis exception tersebut adalah runtime exception bukan checked exception.

    - Meskipun runtime exception tidak wajib menggunakan try-catch expression namun lebih baik menggunakan try-catch untuk
      menghindari program berhenti.

    - Ketika runtime exception tidak menggunakan try-catch maka terlihat tidak berguna karena tetap program akan berhenti, namun
      penggunaan runtime exception tanpa menggunakan try-catch dapat membuat kode lebih rapi apalagi pada saat membuat program yang
      besar, dan untuk errornya dapat di handling sendiri di suatu tempat (error handler).

    - Pada saat membuat class runtime exception, wajib extends class RuntimeException.

    - Contoh class turunan dari class RuntimeException seperti NullPointerException, IllegalArgumentException, dll.

    - Exception Handling adalah fasilitas di java yang digunakan untuk megatasi Error runtime dengan menangkap pesan kesalahan
      tersebut sehingga program tidak berhenti melainkan melanjutkan mengeksekusi baris code selanjutnya.

    - Exception direpresentasikan dalam bentuk class Exception.

    - CLass Exception dapat dibuat sendiri atau menggunkan class exception yang sudah disediakan oleh java.

    - Pada saat membuat exception, maka harus membuat class yang extends class Throwable atau turunan-turunannya.

    - Exception biasanya digunakan di dalam method yang mungkin menghasilkan error runtime, sehingga bisa ditambahkan keywords 'throws'
      dan diikuti dengan class exceptionnya.
    
    - Ketika suatu Method dapat menimbulkan lebih dari satu jenis error maka dapat ditambahkan lebih dari satu class exception.

    - Pada kode program java, untuk membuat exception kita cukup menggunakan keyword throw, diikuti dengan object exceptionnya.

    - Kita dapat memanggil sebuah function/method yang terdapat class exception dengan menggunakan try-catch expression.

    - Ketika terjadi kesalahan pada block try maka block catch akan dieksekusi tapi jika tidak terdapat kesalahan pada block try maka
      block catch tidak akan dieksekusi.

    - Ada beberapa keywword pada java dalam hal Exception Handling.
            1 . Try
                try adalah keyword yang digunakan untuk mencoba menjalankan block program yang berpotensi menyebabkan error pada saat
                runtime keyword ini dipasangkan dengan keyword catch atau finally.
            2.  Catch
                Catch adalah keyword yang digunakan untuk menangkap kesalahan yang terjadi dari block try dan dapat ditampilkan
                pada block catch ini.
            3.  Finally
                Finally adalah keyword yang digunakan untuk menjalankan block program yang akan dieksekusi setelah block program
                yang ada di dalam try dan catch. Block program yang ada di finally akan dieksekusi ketika ada kesalahan maupun tidak ada
                kesalahan, misalnya pada block try kita membaca file dan ketika proses selesai maka kita dapat menutup koneksi ke file
                tersebut melalui block finally.
            4.  throw
                throw adalah keyword yang digunakan untuk melemparkan suatu pesan kesalahan yang dibuat secara manual.
                format : 'throw new Exception("Kesalahan Terjadi !!")'.
            5.  throws
                throws adalah keyword yang digunakan pada suatu method yang mungkin menghasilkan suatu kesalahan sehingga untuk
                memanggil method tersebut maka harus dilakukan handling exception (try-catch) terlebih dahulu.
*/

public class Main {

    public static void main(String[] args) {

        // Ketika username dan password diisi dengan benar.
        Login login1 = new Login("Suardi", "pwd");
        try{
            ValidationCheckedException.validate(login1);
            System.out.println("Username And Password Valid.");
        }catch(ValidationCheckedException exception){
            System.out.println("Error dengan pesan : "+exception.getMessage().toString());
        }finally{
            System.out.println("Thank You !!!");
            System.out.println("= = = = = = = = = = = = = = = = =");
        }

        // Ketika username dan password bernilai null.
        Login login2 = new Login(null, null);
        try{
            ValidationCheckedException.validate(login2);
            System.out.println("Username And Password Valid.");
        }catch(ValidationCheckedException exception){
            System.out.println("Error dengan pesan : "+exception.getMessage().toString());
        }finally{
            System.out.println("Thank You !!!");
            System.out.println("= = = = = = = = = = = = = = = = =");
        }

        // Ketika username dan password bernilai Blank.
        Login login3 = new Login("", "");
        try{
            ValidationCheckedException.validate(login3);
            System.out.println("Username And Password Valid.");
        }catch(ValidationCheckedException exception){
            System.out.println("Error dengan pesan : "+exception.getMessage().toString());
        }finally{
            System.out.println("Thank You !!!");
            System.out.println("= = = = = = = = = = = = = = = = =");
        }

        // Multiple try-catch (menambahkan catch) sehingga memiliki dua atau lebih 'catch'.
        Login login4 = new Login("", "");
        try{
            ValidationCheckedException.validate1(login4);
            System.out.println("Username And Password Valid.");
        }catch(ValidationCheckedException exception){
            System.out.println("Data Kosong/Blank : "+exception.getMessage().toString());
        }catch(NullPointerException exception){
            System.out.println("Data Null : "+exception.getMessage().toString());
        }finally{
            System.out.println("Thank You !!!");
            System.out.println("= = = = = = = = = = = = = = = = =");
        }

        // Multiple try-catch (Penggabungan dua atau lebih class exception).
        Login login5 = new Login(null, null);
        try{
            ValidationCheckedException.validate1(login5);
            System.out.println("Username And Password Valid.");
        }catch(ValidationCheckedException | NullPointerException exception){
            System.out.println("Error dengan pesan : "+exception.getMessage().toString());
        }finally{
            System.out.println("Thank You !!!");
            System.out.println("= = = = = = = = = = = = = = = = =");
        }


        // Pemanggilan method dengan menambahkan runtime exception tidak wajib menggunakan try-catch expression.
        Login login6 = new Login(null, null);
        ValidationRuntimeException.validate2(login6);
        System.out.println("Username And Password Valid.");
        // terjadi error : karena errornya tidak di Handling.
    }
}
