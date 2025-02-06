package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class NameComparator implements Comparator<Movie1> {
    @Override
    public int compare(Movie1 m1, Movie1 m2) {
        return m1.getName().compareTo(m2.getName()); // Alphabetical order (A → Z)
    }
 
    public static void main(String[] args) {
        // Creating a list of movies
        ArrayList<Movie1> movieList = new ArrayList<>();
        movieList.add(new Movie1("Star Wars", 8.7, 1977));
        movieList.add(new Movie1("Empire Strikes Back", 8.8, 1980));
        movieList.add(new Movie1("Return of the Jedi", 8.4, 1983));

        // Sorting by Name (A → Z) inside this class
        Collections.sort(movieList, new NameComparator());

        // Displaying sorted movies
        System.out.println("Movies sorted by Name (A → Z):");
        for (Movie1 m : movieList) {
            System.out.println(m);
        }
    }
}
