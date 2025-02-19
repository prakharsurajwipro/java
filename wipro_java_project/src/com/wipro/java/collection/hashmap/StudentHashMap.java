package com.wipro.java.collection.hashmap;

import java.util.*;

public class StudentHashMap {
    public static void main(String[] args) {

        java.util.HashMap<Integer, String> studentMap = new java.util.HashMap<>();

      
        studentMap.put(101, "Alice");
        studentMap.put(102, "Bob");
        studentMap.put(103, "Charlie");
        studentMap.put(104, "Alice");  // Duplicate Name 
        studentMap.put(105, "Eve");
        studentMap.put(106, "Frank");
        studentMap.put(107, "Bob");    // Duplicate Name 
        studentMap.put(108, "Hannah");
        studentMap.put(109, "Charlie"); // Duplicate Name 
        studentMap.put(110, "Grace");

        // Displaying the students
        System.out.println("Student List:");
        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println("Roll Number: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}
