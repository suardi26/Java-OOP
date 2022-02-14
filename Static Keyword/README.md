## Static Keyword

- <samp>By adding the keyword 'static' to variables and methods, class variables and methods are created,</samp> 
  
  <samp>not instance variables and instance methods, so that without object instances, static variables and</samp> 
  
  <samp>methods can be called with class names.</samp>
  
- <samp>The keyword 'static' can be used for variables, methods, nested classes or other blocks.<samp>
  
- <samp>static variables/class variables are variables that are declared inside a class and outside of methods,</samp> 
  
  <samp>constructors, and other blocks, but static variables are declared using the 'static' keyword. Unlike</samp>  
  
  <samp>instance variables which have their own duplicate values (dynamic) in each object created from a class,</samp>  
  
  <samp>static variables only have one duplicate (static) value in each class and are valid for each object created from a class.</samp>  
  
  <samp>so that even though it has several objects, the value of the static variable will fixed (static) and cannot change on each object.</samp>
  
- <samp>Because a static variable value is fixed, then a static variable can be used for attributes that are common to every object</samp>
  
  <samp>to be created. For example, in the student class, all students have the same college name,</samp> 
    
  <samp>so they can create a static variable with the name 'Name of College'.</samp>
