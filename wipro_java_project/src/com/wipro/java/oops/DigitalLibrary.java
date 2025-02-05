package com.wipro.java.oops;

// Inheritance: DigitalLibrary extends Library
public class DigitalLibrary extends Library {
    
    // Constructor
    public DigitalLibrary(String name, int booksAvailable) {
        super(name, booksAvailable); // Calls the parent class constructor
    }

    // Polymorphism: Overriding abstract method
    @Override
    public void libraryServices() {
        System.out.println(getName() + " offers eBooks, audiobooks, and online courses.");
    }

    // Polymorphism: Overriding displayInfo method
    @Override
    public void displayInfo() {
        super.displayInfo(); // Calls displayInfo() from Library
    }

   
    public static void main(String[] args) {
        Library digitalLib = new DigitalLibrary("Online E-Library", 10000);
        digitalLib.displayInfo();
        digitalLib.libraryServices();
    }
}
