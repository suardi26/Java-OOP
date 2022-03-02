## Method Equals & Hash Code

- <samp>To compare primitive data in Java, you can use the '==' operator, while for non-primitives you can use the 'equals()' method.</samp>

- <samp>The 'equals()' method by default compares two objects according to the position of the object in memory, not from the contents</samp>
  
  <samp> of the attributes of the two objects. therefore we should override the existing equals method in the Object class.</samp>
  
- <samp>The 'HashCode' method is an integer representation method of an object. similar to toString() which is a String representation,</samp> 
  
  <samp>hashCode is an integer representation.</samp> 
  
- <samp>HashCode is very useful for creating unique data structures such as Hasmap, Set, and others. because it is enough to use</samp> 
  
  <samp>the hashCode method to get the unique identity of an object.</samp>
  
- <samp>By default the hashCode method will return an integer value according to the data in memory, but we can override it if necessary.</samp>

- <samp>The contract overrides the hashCode method :</samp>

  - <samp>For the same object must produce the same integer data and if the object is called many times</samp> 
  
    <samp>then the integer data does not change (fix).</samp>
    
  - <samp>If there are 2 objects that are the same when compared to the equals method, the HashCode value must also be the same.</samp>

  - <samp>It's not mandatory to have a different hashCode if the equals method returns false,</samp> 
    
    <samp>because the number of integers is limited to around 2 billion.</samp>
    
- <samp>For more details, please open project [Method Equals & Hash Code](https://github.com/suardi26/Java-OOP/tree/main/Method%20Equals%20%26%20Hash%20Code/src/com/practice) in repositories</samp> 
 
  <samp>suardi26/Java-OOP/Method Equals & Hash Code/src/com/practice/.</samp>

- <samp>Have a nice day.</samp>

---

- <samp>Untuk membandingkan data primitif di java dapat menggunakan operator '==' sedangkan untuk non primitif</samp> 
 
  <samp>menggunakan method 'equals()'.</samp>

- <samp>Method 'equals()' secara default membandingkan dua buah object secara kesamaan posisi object di memory, bukan isi atribut dari</samp>
  
  <samp>kedua object. maka dari itu sebaiknya kita meng-override method equals yang ada pada class Object tersebut.</samp>
  
- <samp>Method 'HashCode' adalah method representasi integer suatu object. mirip dengan toString() yang merupakan representasi String,</samp> 
 
  <samp>hashCode adalah representasi integer.</samp>
  
- <samp>HashCode sangat bermanfaat untuk membuat struktur data unique seperti Hasmap, Set, dan lain-lain. karena cukup menggunakan method</samp> 
 
  <samp>hashCode untuk mendapatkan identitas unique suatu object.</samp>
  
- <samp>Secara default method hashCode akan mengembalikan nilai integer sesuai data di memory, namun kita bisa mengoverride nya jika perlu.</samp>

- <samp>Kontrak mengoverride method hashCode :</samp>

  - <samp>Untuk object yang sama harus menghasilkan data integer yang sama dan jika object dipanggil berkali-kali maka</samp>
  
    <samp>data integer tidak berubah ubah (fix).</samp>
    
  - <samp>Jika ada 2 object yang sama jika dibandingkan dengan method equals, maka nilai HashCodenya juga harus sama.</samp>

  - <samp>Tidak wajib hashCode berbeda jika method equals menghasilkan false, karena keterbatasan jumlah integer sekitar 2 milyar.</samp>

- <samp>Untuk lebih jelasnya, silahkan buka project [Method Equals & Hash Code](https://github.com/suardi26/Java-OOP/tree/main/Method%20Equals%20%26%20Hash%20Code/src/com/practice) di repositori</samp> 
 
  <samp>suardi26/Java-OOP/Method Equals & Hash Code/src/com/practice/.</samp>

- <samp>Semoga harimu menyenangkan</samp>


