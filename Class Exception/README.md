## Class Exception

- <samp>Exception is divided into 3, namely: Checked Exception, Runtime Exception, Error.</samp>

- <samp>Checked Exception must use a try-catch expression.</samp>

- <samp>Runtime Exception is a type of exception that is not required to use a try-catch expression.</samp>

- <samp>When using Checked Exception in a method, it is mandatory to add the keyword 'throws' and the name of the exception class.</samp>

- <samp>The java compiler doesn't detect an error even though we don't use a try-catch expression, when calling a method</samp> 

  <samp>that adds a runtime exception and the method doesn't have to add the 'throws' keyword and the runtime exception</samp> 
  
  <samp>class if the exception type is a runtime exception, not a checked exception.</samp>

- <samp>Although runtime exceptions are not required to use try-catch expressions, it is better to use</samp> 

  <samp>try-catch to avoid program termination.</samp>

- <samp>When runtime exceptions do not use try-catch, it looks useless because the program will still stop, but using</samp> 
  
  <samp>runtime exceptions without using try-catch can make the code neater, especially when creating large programs,</samp> 
  
  <samp>and the error can be handled by yourself in one place(error handler).</samp>

- <samp>When creating an exception, you must create a class that extends the Throwable class or its derivatives.</samp>

- <samp>When creating a runtime exception class, it is mandatory to extend the RuntimeException class.</samp>

- <samp>There are several keywords in java in terms of Exception Handling :</samp>

  - <samp>Try.</samp>

    <samp>Try is a keyword that is used to try to run a program block that has the potential to cause an error at runtime.</samp> 

    <samp>This keyword is paired with the catch or finally keyword.</samp>

  - <samp>Catch.</samp>

    <samp>Catch is the keyword used to catch errors that occur from the try block and can be displayed in this catch block.</samp>

  - <samp>Finally.</samp>

    <samp>Finally is the keyword used to run the program block that will be executed after the program block in the try and catch.</samp> 

    <samp>The program block in finally will be executed when there is an error or no error.</samp>

  - <samp>Throw</samp>

    <samp>throw is the keyword used to throw a manually generated error message.</samp>

    <samp>format :  </samp>
    
    ```java 

    throw new Exception("Error Occurred!!");

    ```
  - <samp>Throws</samp>

    <samp>throws is a keyword used in a method that might generate an error, so to call the method,</samp> 
 
    <samp>an exception handling (try-catch) must be done first.</samp>
    
- <samp>For more details, please open project [Class Exception](https://github.com/suardi26/Java-OOP/tree/main/Class%20Exception/src/com/practice) in repositories suardi26/Java-OOP/Class Exception/src/com/practice/.</samp>

- <samp>Have a nice day.</samp>

---

- <samp>Exception terbagi menjadi 3 yaitu : Checked Exception, Runtime Exception, Error.</samp>

- <samp>Checked Exception wajib menggunakan try-catch expression.</samp>

- <samp>Runtime Exception adalah jenis exception tidak wajib menggunakan try-catch expression.</samp>

- <samp>Pada saat menggunakan Checked Exception pada sebuah method maka wajib menambahkan keyword 'throws' dan nama class exception.</samp>

- <samp>Compiler java tidak mendeteksi error walaupun kita tidak menggunakan try-catch expression, pada saat memanggil method</samp> 
  
  <samp>yang menambahkan runtime exception serta di method tidak wajib menambahkan keyword 'throws' dan class</samp> 
  
  <samp>runtime exception jika jenis exception tersebut adalah runtime exception bukan checked exception.</samp>

- <samp>Meskipun runtime exception tidak wajib menggunakan try-catch expression namun lebih baik</samp> 

  <samp>menggunakan try-catch untuk menghindari program berhenti.</samp>

- <samp>Ketika runtime exception tidak menggunakan try-catch maka terlihat tidak berguna karena tetap program akan berhenti,</samp> 
 
  <samp>namun penggunaan runtime exception tanpa menggunakan try-catch dapat membuat kode lebih rapi apalagi pada saat membuat</samp> 
  
  <samp>program yang besar, dan untuk errornya dapat di handling sendiri di suatu tempat (error handler).</samp>

- <samp>Pada saat membuat exception, maka harus membuat class yang extends class Throwable atau turunan-turunannya.</samp>

- <samp>Pada saat membuat class runtime exception, wajib extends class RuntimeException.</samp>

- <samp> Ada beberapa keywword pada java dalam hal Exception Handling :</samp>

    - <samp>Try</samp>

      <samp>try adalah keyword yang digunakan untuk mencoba menjalankan block program yang berpotensi menyebabkan error pada saat runtime</samp> 

      <samp>keyword ini dipasangkan dengan keyword catch atau finally.</samp>

    - <samp>Catch</samp>

      <samp>Catch adalah keyword yang digunakan untuk menangkap kesalahan yang terjadi dari block try dan dapat</samp> 
 
      <samp>ditampilkan pada block catch ini.</samp>

    - <samp>Finally</samp>

      <samp>Finally adalah keyword yang digunakan untuk menjalankan block program yang akan dieksekusi setelah block program yang ada</samp> 
      
      <samp>di dalam try dan catch. Block program yang ada di finally akan dieksekusi ketika ada kesalahan maupun tidak ada kesalahan.</samp>

    - <samp>throw</samp>

      <samp>throw adalah keyword yang digunakan untuk melemparkan suatu pesan kesalahan yang dibuat secara manual.</samp> 

      <samp>format :</samp>
      
       ```java 

      throw new Exception("Kesalahan Terjadi !!");

      ```
    - <samp>throws</samp>

      <samp>throws adalah keyword yang digunakan pada suatu method yang mungkin menghasilkan suatu kesalahan sehingga untuk memanggil</samp> 

      <samp>method tersebut maka harus dilakukan handling exception (try-catch) terlebih dahulu.</samp>
      
- <samp>Untuk lebih jelasnya, silahkan buka project [Class Exception](https://github.com/suardi26/Java-OOP/tree/main/Class%20Exception/src/com/practice) di repositori suardi26/Java-OOP/Class Exception/src/com/practice/.</samp>

- <samp>Semoga harimu menyenangkan.</samp>
