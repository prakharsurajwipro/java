package com.wipro.java.collection;

import java.util.LinkedList;  // For LinkedList
import java.util.Map;         // For Map Interface
import java.util.HashMap;     // For HashMap Implementation
import java.util.List;        // For List Interface
import java.util.ArrayList;   
import java.util.Arrays;     

public class Collections{  
    public static void main(String[] args) {
        //  Array Operations
    	
        int[] arr = {10, 20, 30, 40, 50}; 
        System.out.println("Array Elements:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("\n");

        //  LinkedList Operations
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("New York");
        linkedList.add("London");
        linkedList.add("Tokyo");
        linkedList.add("Paris");

        System.out.println("LinkedList Elements: " + linkedList);
        linkedList.remove(2); // Removes "Tokyo"
        System.out.println("LinkedList after removal: " + linkedList);

        System.out.print("Iterating LinkedList: ");
        for (String city : linkedList) {
            System.out.print(city + " ");
        }
        System.out.println("\n");

        // Map Operations
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "C++");
        map.put(4, "JavaScript");

        System.out.println("Map Elements: " + map);
        System.out.println("Value for key 2: " + map.get(2));
        map.remove(3); 

        System.out.println("Iterating Map:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println();

        //List Operations (List)
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Red");
        arrayList.add("Blue");
        arrayList.add("Green");
        arrayList.add("Yellow");

        System.out.println("ArrayList Elements: " + arrayList);
        arrayList.remove("Blue"); // Removes "Blue"
        System.out.println("ArrayList after removal: " + arrayList);

        System.out.print("Iterating ArrayList: ");
        for (String color : arrayList) {
            System.out.print(color + " ");
        }
        System.out.println();
    }
}
