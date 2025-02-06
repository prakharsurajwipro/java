package com.wipro.java.collection;


public class Movie1 {
    private String name;
    private double rating;
    private int year;

    // Constructor
    public Movie1(String name, double rating, int year) {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }

    public int getYear() {
        return year;
    }

   
    @Override
    public String toString() {
        return name + " - Rating: " + rating + ", Year: " + year;
    }
}
