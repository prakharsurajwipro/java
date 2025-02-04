package com.wipro.java.interface1;

public class Cow implements Animal {

	public void makeSound() {
		System.out.println("Cow moos: Moo Moo!");
	}
	
	 public static void main(String[] args) {
	        Cow myCow = new Cow();            // Creating an object of Cow
	        myCow.makeSound();              // Calling makeSound method
	    }
}
