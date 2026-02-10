package com.exception;

class AgeNotValidException extends Exception {
    public AgeNotValidException(String message) {
        super(message);
    }
}

public class UserDefinedException {

    static void checkAge(int age) throws AgeNotValidException {

        if (age < 18) {
            throw new AgeNotValidException("Age must be 18 or above!");
        } else {
            System.out.println("Age is valid.");
        }
    }

    public static void main(String[] args) {

        try {
            checkAge(16);
        } catch (AgeNotValidException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Program finished.");
        }
    }
}
