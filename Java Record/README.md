## Java Record

- Java Record is used to create a class that contains data that has a getter, equals, hashCode and toString method.

- Java Record is used to store data and is immutability (cannot be changed) this is to ensure data validation.

- Java Records are usually used in database results, query results, and other data.

- Java Record has an attribute set in the class parameter which is constant/final and has private modifier 
  
  access so it cannot be accessed directly and cannot be changed anymore. but the data can be called with its getter method.

- To call the java record getter method, just write the attribute name followed by '()'.

- When creating a record class, Java will automatically generate getter, equals, hashCode, and toString methods and constructors automatically.

- When creating a record class, it will automatically extend the java.lang.Record class, so it cannot extend other classes, but can implement interfaces.
       
- By default, the record class will create a constructor automatically according to the record/data definition in the class parameter.
