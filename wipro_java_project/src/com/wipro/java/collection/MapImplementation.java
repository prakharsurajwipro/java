package com.wipro.java.collection;

import java.util.HashMap;
import java.util.Map;

public class MapImplementation {

	public static void main(String[] args) {
        // Creating a HashMap
        Map<Integer, String> map = new HashMap<>();

        // Adding elements (put)
        map.put(101, "New York");
        map.put(102, "London");
        map.put(103, "Tokyo");
        map.put(104, "Paris");

        // Retrieving an element (get)
        System.out.println("Value for key 102: " + map.get(102)); // Output: London

        // Removing an element (remove)
        map.remove(103); // Removes Tokyo

        // Iterating over the Map
        System.out.println("Map contents:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

}
}
