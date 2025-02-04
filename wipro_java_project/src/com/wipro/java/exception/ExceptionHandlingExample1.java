package com.wipro.java.exception;

public class ExceptionHandlingExample1 {
	
    public static void main(String[] args) {
        try {
            // Attempting to divide by zero
            int num1 = 10;
            int num2 = 0;
            int result = num1 / num2;                  // This will cause ArithmeticException
            System.out.println("Result: " + result); 
        } 
        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero " + e);  //Catching specific arithmetic exception
        }
        catch (Exception e) {                                            // Catching any  general exception
        	                                                           
            System.out.println("A general exception occurred: " + e);
        }
        finally {
           
            System.out.println("Execution of the try-catch block is complete."); //finally blocks always occur regardless of an exception occuring
        }
    }
}
