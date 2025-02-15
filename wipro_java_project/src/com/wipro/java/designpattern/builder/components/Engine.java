package com.wipro.java.designpattern.builder.components;

public class Engine {
    private final double volume;
    private double mileage;

    public Engine(double volume, double mileage) {
        this.volume = volume;
        this.mileage = mileage;
    }

    public double getVolume() {
        return volume;
    }
}
