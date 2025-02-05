package com.wipro.java.oops;

//Inheritance: PublicLibrary extends Library

public class PublicLibrary extends Library {
	private String location;

	public PublicLibrary(String name, int booksAvailable, String location) {
		
		super(name, booksAvailable); // Calls the parent class (Library) constructor
		this.location = location;
	}

	// Getter for location
	public String getLocation() {
		return location;
	}

	// Polymorphism: Overriding abstract method
	@Override
	public void libraryServices() {
		System.out.println(getName() + " offers reading rooms and community events.");
	}

	// Polymorphism: Overriding displayInfo method
	@Override
	public void displayInfo() {
		super.displayInfo(); // Calls displayInfo() from Library
		System.out.println("Location: " + location);
	}


	public static void main(String[] args) {
		
		// Creating instances using Polymorphism
		Library lib1 = new PublicLibrary("Central Library", 5000, "Bengaluru");
		

		// Method calls (Runtime Polymorphism)
		
		lib1.displayInfo();
		lib1.libraryServices();

		
	}
}
