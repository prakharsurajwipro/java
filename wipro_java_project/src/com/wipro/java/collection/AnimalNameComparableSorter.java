package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class AnimalNameComparableSorter {
    public static void main(String[] args) {
        // Creating a list of animals
        ArrayList<AnimalComparable> animals = new ArrayList<>();
        animals.add(new AnimalComparable("Zebra", 5, 300.0));
        animals.add(new AnimalComparable("Elephant", 10, 500.5));
        animals.add(new AnimalComparable("Dog", 3, 20.2));
        animals.add(new AnimalComparable("Horse", 7, 350.0));
        animals.add(new AnimalComparable("Cat", 2, 10.5));

        // Sorting animals by name (A → Z) using Comparator
        Collections.sort(animals, Comparator.comparing(AnimalComparable::getName));

        // Displaying the sorted list
        System.out.println("Animals sorted by Name (A → Z):");
        for (AnimalComparable animal : animals) {
            System.out.println(animal);
        }
    }
}
