package com.wipro.java.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi {
    public static void main(String[] args) {
      
        List<String> names = Arrays.asList("Prakhar", "hriday");

        // Filtering names starting with 'P', converting to uppercase, and sorting them
        List<String> processedNames = names.stream()
                                           .filter(name -> name.startsWith("P"))
                                           .map(String::toUpperCase)
                                           .sorted()
                                           .collect(Collectors.toList());

        System.out.println("Processed Names: " + processedNames);

        // List of numbers
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 3, 10, 20, 5, 25, 30);

        // Sorting numbers
        List<Integer> sortedNumbers = numbers.stream()
                                             .sorted()
                                             .collect(Collectors.toList());

        // Finding min and max
        int min = numbers.stream().min(Integer::compare).orElseThrow();
        int max = numbers.stream().max(Integer::compare).orElseThrow();

        // Printing results
        System.out.println("Sorted Numbers: " + sortedNumbers);
        System.out.println("Minimum Number: " + min);
        System.out.println("Maximum Number: " + max);
    }
}
