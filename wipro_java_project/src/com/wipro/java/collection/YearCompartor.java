package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class YearCompartor implements Comparator<Movie1> {
    @Override
    public int compare(Movie1 m1, Movie1 m2) {
        return Integer.compare(m1.getYear(), m2.getYear()); // Sorting by year (Oldest → Newest)
    }

   
    public static void main(String[] args) {
        // Creating a list of movies
        ArrayList<Movie1> movieList = new ArrayList<>();
        movieList.add(new Movie1("Star Wars", 8.7, 1977));
        movieList.add(new Movie1("Empire Strikes Back", 8.8, 1980));
        movieList.add(new Movie1("Return of the Jedi", 8.4, 1983));

        // Sorting by Year (Oldest → Newest)
        Collections.sort(movieList, new YearCompartor());

        // Displaying sorted movies
        System.out.println("Movies sorted by Year (Oldest → Newest):");
        for (Movie1 m : movieList) {
            System.out.println(m);
        }
    }
}
