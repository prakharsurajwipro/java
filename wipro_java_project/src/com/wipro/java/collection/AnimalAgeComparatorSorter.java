package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class AnimalAgeComparatorSorter implements Comparator<AnimalComparator> {

    @Override
    public int compare(AnimalComparator a1, AnimalComparator a2) {
        return Integer.compare(a1.getAge(), a2.getAge()); // Sorting by age (Young → Old)
    }

 
    public static void main(String[] args) {
        // Creating a list of animals
        ArrayList<AnimalComparator> animals = new ArrayList<>();
        animals.add(new AnimalComparator("Zebra", 5, 300.0));
        animals.add(new AnimalComparator("Elephant", 10, 500.5));
        animals.add(new AnimalComparator("Dog", 3, 20.2));
        animals.add(new AnimalComparator("Horse", 7, 350.0));
        animals.add(new AnimalComparator("Cat", 2, 10.5));

        // Sorting animals by Age (Young → Old)
        Collections.sort(animals, new AnimalAgeComparatorSorter());

        // Displaying the sorted list
        System.out.println("Animals sorted by Age (Young → Old):");
        for (AnimalComparator animal : animals) {
            System.out.println(animal);
        }
    }
}
