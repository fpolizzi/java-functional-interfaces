# Java Functional Interfaces

## Properties of Function Programming

| Property	                | Description                                                                                                                                       |
|--------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------|
| No state                 | Functions do not rely on or alter the state of the system.                                                                                        |
| Pure functions           | Functions always produce the same output for the same input.                                                                                      |
| No side effects          | Functions do not cause any observable side effects outside their scope.                                                                           |
| Higher-order functions   | Functions can take other functions as arguments and return them as results.                                                                       |
| First-class functions    | Functions are treated as first-class citizens, meaning they can be assigned to variables, passed as arguments, and returned from other functions. |
| Immutability             | Data is immutable, meaning it cannot be changed once created.                                                                                     |
| Referential transparency | Expressions can be replaced with their values without changing the program's behavior.                                                            |
| Lazy evaluation          | Expressions are not evaluated until their values are needed.                                                                                      |
| Recursion                | Functions call themselves to perform iterative tasks.                                                                                             |

### What is a Functional Interface?

A functional interface is an interface that has only one abstract method.

Functional interfaces can be annotated with `@FunctionalInterface`.

### Working with Lambdas

A lambda expression is an anonymous function that can be used 
to create instances of functional interfaces.

```java
@FunctionalInterface
public interface EmailSender {
    boolean send(String from, String to);
}
```

```java
public class Main {
    public static void main(String[] args) {
        EmailSender gmail = (from, to) -> {
            System.out.println("Sending email using Gmail");
            return false;
        };

        EmailSender hotmail = (from, to) -> {
            // logic
            var isValid = to.contains("@");
            // more logic
            System.out.println("Sending email using Hotmail");
            return true;
        };

        boolean wasEmailSent = gmail.send("hello@amigocode.com", "alex@gmail.com");
        hotmail.send("hello@amigocode.com", "jamila@gmail.com");
    }
}
```

### Method References

```java
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<String> names = List.of("Jamila", "Alex", "Mariam");

        Consumer<String> stringConsumer = System.out::println;

        // if the lambda is performing only one operation
        // on the argument, we can replace it by using
        // method reference to this argument
         names.forEach(System.out::println);
    }
}
```

## Functional Interfaces

The `java.util.function` package provides several functional interfaces that are commonly used in Java programming.
Functional Interfaces provide target types for lambda expressions and method references.

### Function

The **Function** interface is a part of the `java.util.function` package. 
It represents a function that accepts one argument and produces a result. This is a functional interface, which means it can be used as the assignment target for a lambda expression or method reference.

The **Function** interface has a single abstract method called **apply** which takes an argument of type **T** and returns a result of type **R**.

```java
Function<String, Integer> function = (String s) -> s.length();
```

### Chaining Functions

In Java, you can chain multiple functions together to create a sequence of operations. This is particularly useful when you want to perform a series of transformations on data. 
The **Function** interface provides a method called **andThen** that allows you to chain functions together.

```java
Function<String, Integer> function1 = (String s) -> s.length();
Function<Integer, Integer> function2 = (Integer i) -> i * 2;

Function<String, Integer> chainedFunction = function1.andThen(function2);

int result = chainedFunction.apply("Hello");
System.out.println(result); // Output: 10
```

