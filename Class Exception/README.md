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
  
  <samp>and the error can be handled by yourself in one place. place (error handler).</samp>

- <samp>When creating an exception, you must create a class that extends the Throwable class or its derivatives.</samp>

- <samp>When creating a runtime exception class, it is mandatory to extend the RuntimeException class.</samp>
