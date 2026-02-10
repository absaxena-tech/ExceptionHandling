package com.exception;

class AgeNotValidException extends Exception {
    public AgeNotValidException(String message) {
        super(message);
    }
}
public class UserDefinedException {
    public static void main(String[] args) {

        int age = 16;

        try {
            if (age > 18) {
                throw new AgeNotValidException("Age must be 18 or above!");
            }
        } catch (AgeNotValidException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Age is valid.");
        }
    }
}
