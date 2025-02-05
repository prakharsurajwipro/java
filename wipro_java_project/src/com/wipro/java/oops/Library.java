package com.wipro.java.oops;

public abstract class Library {
	private String name;
	private int booksAvailable;

	// Constructor (Encapsulation: Private fields, accessed via getters/setters)
	public Library(String name, int booksAvailable) {
		this.name = name;
		this.booksAvailable = booksAvailable;
	}

	// Encapsulation: Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBooksAvailable() {
		return booksAvailable;
	}

	public void setBooksAvailable(int booksAvailable) {
		this.booksAvailable = booksAvailable;
	}

	// Abstraction: Abstract method (to be implemented in subclasses)
	public abstract void libraryServices();

	// Polymorphism: Concrete method (can be overridden)
	public void displayInfo() {
		System.out.println("Library Name: " + name + ", Books Available: " + booksAvailable);
	}
}