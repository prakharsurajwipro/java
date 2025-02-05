package com.wipro.java.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckUncheckExceptionCombine {

	    public static void main(String[] args) {
	        // Checked Exception: FileNotFoundException
	        try {
	            File file = new File("test.txt"); // File does not exist
	            Scanner reader = new Scanner(file);
	            System.out.println(reader.nextLine()); // Read first line
	            reader.close();
	        } catch (FileNotFoundException e) {
	            System.out.println("Checked Exception caught: " + e);
	        }

	        // Unchecked Exception: NullPointerException
	        try {
	            File file = null;
	            System.out.println(file.getName()); // Calling method on null object
	        } catch (NullPointerException e) {
	            System.out.println("Unchecked Exception caught: " + e);
	        }
          
	        finally {
	        System.out.println("Program executed successfully.");
	        }
	    }
	}


