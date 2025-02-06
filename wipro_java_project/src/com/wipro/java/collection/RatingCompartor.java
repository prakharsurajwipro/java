package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class RatingCompartor implements Comparator<Movie1> {
    @Override
    public int compare(Movie1 m1, Movie1 m2) {
        return Double.compare(m1.getRating(), m2.getRating()); // Sorting by rating (Low → High)
    }

    // Main method for testing sorting inside this class
    public static void main(String[] args) {
        // Creating a list of movies
        ArrayList<Movie1> movieList = new ArrayList<>();
        movieList.add(new Movie1("Star Wars", 8.7, 1977));
        movieList.add(new Movie1("Empire Strikes Back", 8.8, 1980));
        movieList.add(new Movie1("Return of the Jedi", 8.4, 1983));

        // Sorting by Rating (Low → High)
        Collections.sort(movieList, new RatingCompartor());

        // Displaying sorted movies
        System.out.println("Movies sorted by Rating (Low → High):");
        for (Movie1 m : movieList) {
            System.out.println(m);
        }
    }
}
