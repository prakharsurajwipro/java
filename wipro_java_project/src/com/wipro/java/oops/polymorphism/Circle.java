package com.wipro.java.oops.polymorphism;

// Child class inheriting from Shape
public class Circle extends Shape {

	
    public static void main(String[] a) {
        Circle myShape = new Circle(); // Creating child class object
        
        System.out.println("This is Circle");

        // Setting values in parent class using dot operator
        myShape.setColor("Red");
        myShape.setBorderWidth(2);

        //Calling draw() method to display values
        myShape.draw();
    }
}
