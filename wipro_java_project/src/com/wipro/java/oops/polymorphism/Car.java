package com.wipro.java.oops.polymorphism;

class Car {
    private String brand;
    private int speed; 

    // Getter methods
    public String getBrand() {
        return brand;
    }

    public int getSpeed() {
        return speed;
    }

    // Setter methods
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // Method to be overridden (Polymorphism)
    public void displayInfo() {  
        System.out.println("Car Brand::::: " + brand);
        System.out.println("Speed:: " + speed + " km/h");
    }
}
