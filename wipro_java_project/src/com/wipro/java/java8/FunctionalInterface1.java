package com.wipro.java.java8;

@FunctionalInterface
interface ShapeInterface {

    // Abstract method
    public double area(double dimension);

    // Default Method 1
    default void displayShape() {
        System.out.println("This is a shape.");
    }

    // Default Method 2
    default void perimeterFormula() {
        System.out.println("Each shape has a different perimeter formula.");
    }

    // Static Method 1
    static void welcomeMessage() {
        System.out.println("Welcome to the Shape Interface!");
    }

    // Static Method 2
    static String shapeExamples() {
        return "Examples: Circle, Square, Triangle, Rectangle.";
    }
}

// Implementation Class
public class FunctionalInterface1 implements ShapeInterface {
    private double radius;

    // Constructor
    public FunctionalInterface1(double radius) {
        this.radius = radius;
    }

    // Implementing the abstract method from ShapeInterface
    @Override
    public double area(double dimension) {
        return Math.PI * dimension * dimension; 
    }

    public static void main(String[] args) {
        // Calling Static Methods from Interface
        ShapeInterface.welcomeMessage();
        System.out.println(ShapeInterface.shapeExamples());

        FunctionalInterface1 circle = new FunctionalInterface1(5);

        // Calling Implemented Abstract Method
        System.out.println("Area of Circle: " + circle.area(circle.radius));

        // Calling Default Methods
        circle.displayShape();
        circle.perimeterFormula();
    }
}
