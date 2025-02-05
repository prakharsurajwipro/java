package com.wipro.java.interface1;

public class AllInOnePrinter implements Printer, Scanner{

	public void print() {
        System.out.println("Printing a document...");
    }

    public void scan() {
        System.out.println("Scanning a document...");
    }

    public static void main(String[] args) {
        AllInOnePrinter machine = new AllInOnePrinter(); // Creating object

        machine.print(); // Calling print method
        machine.scan();  // Calling scan method
    }
}
