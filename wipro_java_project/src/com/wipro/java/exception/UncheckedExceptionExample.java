package com.wipro.java.exception;

public class UncheckedExceptionExample{
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};

        try {
            System.out.println(numbers[5]);                         // Invalid index, throws exception
        } catch (ArrayIndexOutOfBoundsException e) { 
        	
             // Catching the exception
            System.out.println("Invalid array index accessed: " + e.getMessage());
        }
        finally {

        System.out.println("Program continues normally...");
        }
    }
}