package com.wipro.oops.polymorphism; 
 

public class ElectricCar extends Car {

    

    @Override
    public void displayInfo() {
        System.out.println("Car Brand: " + getBrand()); 
        System.out.println("Speed: " + getSpeed() + " km/h"); 
      
    }

    // Main method inside child class
    public static void main(String[] args) {
        ElectricCar myCar = new ElectricCar(); // ✅ Creating an instance

        // Setting values before calling displayInfo()
        myCar.setBrand("Teslaa");
        myCar.setSpeed(250);

       //Calling overridden method (Polymorphism)
        myCar.displayInfo();
    }
}
