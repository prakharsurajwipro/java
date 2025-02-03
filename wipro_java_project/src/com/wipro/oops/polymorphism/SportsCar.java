package com.wipro.oops.polymorphism;

// Child class inheriting from Car
public class SportsCar extends Car {


    public SportsCar() {
   
    }

    // Main method inside child class
    public static void main(String[] args) {
        SportsCar myCar = new SportsCar();

        //Setting values before calling displayInfo()
        myCar.setBrand("Ferrari");
        myCar.setSpeed(320);

       // Now calling displayInfo() to display values
        myCar.displayInfo();
    }
}
