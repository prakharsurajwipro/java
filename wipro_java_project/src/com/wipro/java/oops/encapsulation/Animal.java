package com.wipro.java.oops.encapsulation;

public class Animal {

    private String species;
    private int age;

    public Animal(String species, int age) {
        super(); // calls the root parent class = Object
        this.species = species;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be positive..");
        }
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public static void main(String[] args) {
        Animal a1 = new Animal("Dog", 5);
        System.out.println(a1.getAge());
        System.out.println(a1.getSpecies());

        a1.setAge(7);
        System.out.println(a1.getAge());
        System.out.println(a1.getSpecies());

        a1.setAge(-3); 
    }
}