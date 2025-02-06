package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Collections;

class AnimalComparable implements Comparable<AnimalComparable> {
    private String n; // Animal name
    private int a;    // Animal age
    private double w; // Animal weight

    // Constructor
    public AnimalComparable(String n, int a, double w) {
        this.n = n;
        this.a = a;
        this.w = w;
    }

    // Implementing compareTo method 
    @Override
    public int compareTo(AnimalComparable other) {
        return Integer.compare(this.a, other.a); 
    }

    // Getter methods
    public String getName() {
        return n;
    }

    public int getAge() {
        return a;
    }

    public double getWeight() {
        return w;
    }

    @Override
    public String toString() {
        return "Animal{name='" + n + "', age=" + a + ", weight=" + w + "}";
    }
}
