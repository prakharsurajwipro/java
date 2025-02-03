package com.wipro.oops.abstraction;


public class Maruti extends Car {

 
 @Override
 public void mileage() {
     System.out.println("Maruti Mileage: 15 km/l");
 }

 @Override
 public void speed() {
     System.out.println("Maruti Speed: 250 km/hour");
 }

 public static void main(String[] args) {
     Audi myCar = new Audi();

     myCar.mileage();
     myCar.speed();
 }

}
