package com.wipro.java.java8;

interface InterfaceA {
	// Default method
	default void display() {
		System.out.println("Default method from InterfaceA");
	}
}

interface InterfaceB {
	// Default method
	default void display() {
		System.out.println("Default method from InterfaceB");
	}
}

public class DefaultUseCase implements InterfaceA, InterfaceB {

	public void display() {

		// use super keyword to call display
		// Calling display method of InterfaceA
		InterfaceA.super.display();

		// use super keyword to call display
		// Calling display method of InterfaceB
		InterfaceB.super.display();
	}

	public static void main(String[] args) {
		DefaultUseCase obj = new DefaultUseCase();
		obj.display();
	}
}
