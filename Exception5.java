package com.org.main;
/*Write a Java program to catch and handle a custom exception named MyCustomException.
custom exception is an exception that you define in your own code by extending 
the Exception class or one of its subclasses, 
such as RuntimeException or Exception. */
class MyCustomException extends Exception {
    MyCustomException(String message) {
        super(message);
    }
}

public class Exception5 {
    public static void main(String[] args) {
        try {
            throw new MyCustomException("This is a custom exception.");
        } catch (MyCustomException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

