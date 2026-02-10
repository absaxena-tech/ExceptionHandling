package com.exception;

//Throws declares exceptions that a method might throw, informing the caller to manage them. It is mainly used with
//checked exceptions. If a method calls another method that throws a checked exception and it does not catch it,
//it must declared the exception in "throws" clause.

public class throwsExample {
    public static void divide() throws ArithmeticException{
        int n=10;
        int m=0;
        int result = n/m;
        System.out.println(result);
    }
    static void main(String[] args) {
        divide();
    }
}
