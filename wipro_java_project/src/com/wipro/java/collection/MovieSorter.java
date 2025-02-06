package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Collections;

public class MovieSorter {
    public static void main(String[] args) {
        //List of movies
        ArrayList<Movie> movieList = new ArrayList<>();
        movieList.add(new Movie("Star Wars", 8.7, 1977));
        movieList.add(new Movie("Empire Strikes Back", 8.8, 1980));
        movieList.add(new Movie("Return of the Jedi", 8.4, 1983));

        // Sorts movies using Comparable (sorting by rating)
        Collections.sort(movieList);

        // Display the sorted list of movies
        System.out.println("Movies after sorting by rating:");
        for (Movie m : movieList) {
            System.out.println(m.getName() + " " + m.getRating() + " " + m.getYear());
        }
    }
}
