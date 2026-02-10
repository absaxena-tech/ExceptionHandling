package com.exception;
import java.util.*;

//finally blocks always executed does not matter if exeption happens or not
// Finally block is going to execute everytime.

public class tryCatchFinally {
    static void main(String[] args) {
            int[] arr = {1,2,3};



           try{
               int result = arr[4];
               System.out.println(result);

           }catch (ArrayIndexOutOfBoundsException e){
               System.out.println("Array index Out of Bound Exception Happens");
           }
           finally {
               System.out.println("Finally Block always occurs.");
           }
    }
}
