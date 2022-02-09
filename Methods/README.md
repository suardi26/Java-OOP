## Methods

- <samp>A method in the Java programming language is a collection of lines of code grouped together to perform a specific task.</samp>

- <samp>A method can return a certain value (have a return value), or not (void).</samp>

- <samp>Procedures are functions that do not return a value. This function is usually marked with the keyword 'void'.</samp>

- <samp>A function is a name for a function that returns a value. return the value to the function using the keyword 'return'.</samp>

- <samp>Methods are functions that are in a class.</samp>
 
- <samp>Method can also have several parameters to hold information (arguments) when the method is called.</samp>

- <samp>Parameter is the name for the function's input value when the function is defined. when the method is called and the</samp> 
 
  <samp>information (arguments) has been filled in, the arguments will be accommodated in the parameters according</samp> 
  
  <samp>to the specified data type.</samp>
  
- <samp>Argument is a name for the function's input value when the function is called.</samp>

- <samp>Example :</samp>

  ```java
    public class Example {
        
        // the variables i and t are parameters
        public static int multiplication(int i, int t) 
        {
            return i * t;
        }

        public static void main(String[] args)
        {
            int num1 = 2;
            int num2 = 5;
          
            // num1 and num2 is the value of the arguments that will be accommodated in the parameter with data type Integer.
            int result = multiplication(num1, num2); 

            System.out.println("Result : " + result);
        }
    }
  ```
  
- <samp>For more details, please open [Main.java](https://github.com/suardi26/Java-OOP/blob/main/Methods/src/com/practice/Main.java) in repositories suardi26/Java-OOP/Methods/src/com/practice/.</samp>

- <samp>Have a nice day.</samp>

---

- <samp>Method pada bahasa pemrograman Java adalah kumpulan baris kode yang dikelompokkan untuk menjalankan tugas tertentu.</samp>

- <samp>Sebuah method dapat mengembalikan nilai tertentu (memiliki return value), bisa juga tidak (void).</samp>

- <samp>Prosedur adalah fungsi yang tidak mengembalikan nilai. Fungsi ini biasanya ditandai dengan kata kunci ' void '.</samp>

- <samp>Fungsi adalah sebutan untuk fungsi yang mengembalikan nilai. pengembalian nilai pada fungsi menggunakan keyword  'return'.</samp>

- <samp>Method adalah fungsi yang berada di dalam sebuah Class.</samp>

- <samp>Method juga dapat memiliki beberapa parameter untuk menampung  informasi (argument) pada saat method di panggil.</samp>

- <samp>Parameter adalah sebutan untuk nilai inputan fungsi pada saat fungsi itu didefinisikan. pada saat method dipanggil</samp> 
 
  <samp>dan informasi (argument) telah diisi maka argument tersebut nantinya akan di tampung  pada parameter</samp> 
  
  <samp>sesuai dengan tipe data yang ditentukan.</samp> 
  
- <samp>Argumen adalah sebutan untuk nilai inputan fungsi pada saat fungsi itu dipanggil.</samp>

- <samp>Contoh :</samp>

  ```java
    public class Contoh {
        
        // variabel i dan t adalah parameter.
        public static int multiplication(int i, int t) 
        {
            return i * t;
        }

        public static void main(String[] args)
        {
            int num1 = 2;
            int num2 = 5;
          
            // variabel num1 dan num2 adalah nilai arguments yang akan ditampung pada parameter dengan tipe data Integer.
            int result = multiplication(num1, num2); 

            System.out.println("Result : " + result);
        }
    }
  ```
- <samp>Untuk lebih jelasnya, silahkan buka [Main.java](https://github.com/suardi26/Java-OOP/blob/main/Methods/src/com/practice/Main.java) di repositori suardi26/Java-OOP/
Methods/src/com/practice/.</samp>

- <samp>Semoga harimu menyenangkan.</samp>
  
