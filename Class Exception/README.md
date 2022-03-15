## Class Exception

- Exception is divided into 3, namely: Checked Exception, Runtime Exception, Error.

- Checked Exception must use a try-catch expression.

- Runtime Exception is a type of exception that is not required to use a try-catch expression.

- When using Checked Exception in a method, it is mandatory to add the keyword 'throws' and the name of the exception class.

- The java compiler doesn't detect an error even though we don't use a try-catch expression, when calling a method that adds a runtime exception and the method doesn't have to add the 'throws' keyword and the runtime exception class if the exception type is a runtime exception, not a checked exception.

- Although runtime exceptions are not required to use try-catch expressions, it is better to use try-catch to avoid program termination.

- When runtime exceptions do not use try-catch, it looks useless because the program will still stop, but using runtime exceptions without using try-catch can make the code neater, especially when creating large programs, and the error can be handled by yourself in one place. place (error handler).

- When creating an exception, you must create a class that extends the Throwable class or its derivatives.

- When creating a runtime exception class, it is mandatory to extend the RuntimeException class.
