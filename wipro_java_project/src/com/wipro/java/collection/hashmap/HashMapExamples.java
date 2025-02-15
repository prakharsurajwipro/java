package com.wipro.java.collection.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

class HashMapExamples {
    public static void main(String[] args) {
        // Example 1: Creating a HashMap
        HashMap<String, Integer> languages = new HashMap<>();
        languages.put("Java", 8);
        languages.put("JavaScript", 1);
        languages.put("Python", 3);
        System.out.println("\nExample 1 - Creating a HashMap");
        System.out.println("Languages HashMap: " + languages);

        // Example 2: Adding elements to a HashMap
        HashMap<String, Integer> numbers = new HashMap<>();
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        System.out.println("\nExample 2 - Adding Elements to a HashMap");
        System.out.println("Numbers HashMap after put(): " + numbers);

        // Example 3: Accessing elements in a HashMap
        HashMap<Integer, String> langMap = new HashMap<>();
        langMap.put(1, "Java");
        langMap.put(2, "Python");
        langMap.put(3, "JavaScript");
        System.out.println("\nExample 3 - Accessing Elements in a HashMap");
        System.out.println("Languages HashMap: " + langMap);
        System.out.println("Value at key 1: " + langMap.get(1));
        System.out.println("All Keys: " + langMap.keySet());
        System.out.println("All Values: " + langMap.values());
        System.out.println("All Entries: " + langMap.entrySet());

        // Example 4: Changing elements in a HashMap
        langMap.replace(2, "C++");
        System.out.println("\nExample 4 - Changing Elements in a HashMap");
        System.out.println("Updated HashMap after replace(): " + langMap);

        // Example 5: Removing elements from a HashMap
        String removedValue = langMap.remove(2);
        System.out.println("\nExample 5 - Removing Elements from a HashMap");
        System.out.println("Removed Value at key 2: " + removedValue);
        System.out.println("Updated HashMap: " + langMap);

        // Example 6: Iterating through a HashMap
        System.out.println("\nExample 6 - Iterating Through a HashMap");
        System.out.print("Keys: ");
        for (Integer key : langMap.keySet()) {
            System.out.print(key + " ");
        }
        System.out.print("\nValues: ");
        for (String value : langMap.values()) {
            System.out.print(value + " ");
        }
        System.out.print("\nEntries: ");
        for (Entry<Integer, String> entry : langMap.entrySet()) {
            System.out.print(entry + " ");
        }
        System.out.println();

        // Example 7: Creating a HashMap from another Map (TreeMap)
        TreeMap<String, Integer> evenNumbers = new TreeMap<>();
        evenNumbers.put("Two", 2);
        evenNumbers.put("Four", 4);
        System.out.println("\nExample 7 - Creating a HashMap from Another Map (TreeMap)");
        System.out.println("TreeMap: " + evenNumbers);
        HashMap<String, Integer> newNumbers = new HashMap<>(evenNumbers);
        newNumbers.put("Three", 3);
        System.out.println("HashMap from TreeMap: " + newNumbers);
    }
}
