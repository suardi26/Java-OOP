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


