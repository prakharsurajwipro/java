package com.wipro.java.oops.polymorphism;

// Child class inheriting from Car
public class ElectricCarrr extends Car {

    public ElectricCarrr() {
       
    }

    // Main method inside child class
    public static void main(String[] args) {
        ElectricCarrr myCar = new ElectricCarrr();

        // Setting values before calling displayInfo()
        myCar.setBrand("Tesla");
        myCar.setSpeed(250);

        // Now calling displayInfo() to display values
        myCar.displayInfo();
    }
}
