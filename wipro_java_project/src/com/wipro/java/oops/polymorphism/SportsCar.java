package com.wipro.java.oops.polymorphism;

// Child class inheriting from Car
public class SportsCar extends Car {


    public SportsCar() {
   
    }

    // Main method inside child class
    public static void main(String[] args) {
        SportsCar myCar = new SportsCar();

        //Setting values before calling displayInfo()
        myCar.setBrand("Ferrarii");
        myCar.setSpeed(320);

       // Now calling displayInfo() to display values
        myCar.displayInfo();
    }
}
