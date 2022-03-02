## Method Equals & Hash Code

- <samp>To compare primitive data in Java, you can use the '==' operator, while for non-primitives you can use the 'equals()' method.</samp>

- <samp>The 'equals()' method by default compares two objects according to the position of the object in memory, not from the contents</samp>
  
  <samp> of the attributes of the two objects. therefore we should override the existing equals method in the Object class.</samp>
  
- <samp>The 'HashCode' method is an integer representation method of an object. similar to toString() which is a String representation,</samp> 
  
  <samp>hashCode is an integer representation.</samp> 
  
- <samp>HashCode is very useful for creating unique data structures such as Hasmap, Set, and others. because it is enough to use</samp> 
  
  <samp>the hashCode method to get the unique identity of an object.</samp>
  
- <samp>By default the hashCode method will return an integer value according to the data in memory, but we can override it if necessary.</samp> 
