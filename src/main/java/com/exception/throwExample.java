package com.exception;


//throws used to explicitly thrown an single exception, We use throw when something goes wrong &
//we want to stop the normal flow and address through exception handling
public class throwExample {

    public static void checkAge(int age){
        if(age<18){
            throw new ArithmeticException("Age must be greater than 18");
        }
        else System.out.println("Age is valid.");
    }
    public static void main(String[] args) {
        checkAge(15);
    }
}
