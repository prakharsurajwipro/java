package com.wipro.java.designpattern.builder;

import com.wipro.java.designpattern.builder.builders.CarBuilder;
import com.wipro.java.designpattern.builder.cars.Car;
import com.wipro.java.designpattern.builder.director.Director;

public class Demo {
    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());
    }
}
