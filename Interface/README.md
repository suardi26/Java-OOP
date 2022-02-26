## Interface

- <samp>Same as abstract class, but interface only contains abstract methods (no code block) and constant attributes</samp> 
  
  <samp>(attribute values cannot be changed).</samp>
  
- <samp>To inherit the interface can use the keyword 'implements' instead of 'extends'. </samp>

- <samp>Interface also can not be used directly to create objects. but the contents of the</samp> 
  
  <samp>interface can be passed down to its sub class so that abstract methods from the superclass</samp> 
  
  <samp>can be made/implemented to be concrete or specific to the subclass.</samp>
  
- <samp>The default method on the interface is public and abstract.</samp>

- <samp>The default interface attribute is public static final.</samp>

- <samp>When implementing an interface, all methods in the interface must be overridden in its subclass.</samp>

- <samp>Since java 8 we can create interface methods that have implementation bodies using the 'default' keyword, by</samp> 
 
  <samp>creating a default method the subclass is not required to override. Only given the Option whether to Override or not.</samp>

