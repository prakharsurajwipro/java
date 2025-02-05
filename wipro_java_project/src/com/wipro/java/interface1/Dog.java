package com.wipro.java.interface1;

public class Dog implements Animal {

	   public void makeSound() {
	        System.out.println("Dog barks: Woof Woof!");
	    }
	   
	   public static void main(String[] args) {
	        Dog myDog = new Dog(); // Creating an object of Dog
	        myDog.makeSound(); // Calling makeSound method

}
}
