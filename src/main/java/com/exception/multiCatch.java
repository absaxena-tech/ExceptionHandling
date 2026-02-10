package com.exception;

public class multiCatch {
    static void main(String[] args) {
        int arr[]={0,2,3,4,5};

        try{
            int outOfBound=arr[6];
            int result =arr[1]/arr[0];
        }
        catch(ArrayIndexOutOfBoundsException | ArithmeticException e){
            System.out.println(e.getMessage());
            System.out.println("You are accessing index which is out of Bound");
        }
        finally{
            System.out.println("Finally Block always executes.");
        }
    }
}
