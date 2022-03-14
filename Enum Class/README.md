## Enum Class

- <samp>Just like regular classes, Enums can have attributes, methods and constructors. however, enums contain 

  <samp>constants which automatically have public static and final modifiers, and enums cannot be instantiated.

- <samp>Enum class is used to hold predefined finite values, such as gender, Name of day, etc.

- <samp>When creating an Enum class, it will automatically extend the java.lang.Enum class so that the 
    
  <samp>enum class cannot extend other classes, but can implement interfaces.

- <samp>As usual classes, enum classes can add members (attributes, methods, and constructors).

- <samp>However, for constructors, we cannot create constructors with public modifiers, only private or 
    
  <samp>default modifiers, because the purpose of enum classes is not to be instantiated freely.

- <samp>When creating a constructor in an enum, all options for constant enum values ​​must call the constructor's method, for example parameters.

- <samp>Enums can be created in a class or in a separate file.
