package com.wipro.oops.abstraction;


public class Audi extends Car {

 
 @Override
 public void mileage() {
     System.out.println("Audi Mileage: 15 km/litre");
 }

 @Override
 public void speed() {
     System.out.println("Audi Speed: 250 km/hour");
 }

 public static void main(String[] args) {
     Audi myCar = new Audi();

     myCar.mileage();
     myCar.speed();
 }

}
