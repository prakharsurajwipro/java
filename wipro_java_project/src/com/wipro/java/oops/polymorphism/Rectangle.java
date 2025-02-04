package com.wipro.java.oops.polymorphism;

// Child class inheriting from Shape
public class Rectangle extends Shape {

 
   
    public static void main(String[] a) {
        Rectangle myShape = new Rectangle(); // Creating child class object
        
        System.out.println("This is rectangle");

        // Setting values in parent class using dot operator
        myShape.setColor("Blue");
        myShape.setBorderWidth(3);

        //Calling draw() method which is in parent class to display values
        myShape.draw();
    }
}
