package com.wipro.java.collection.treemap;

import java.util.*;

public class TreeMapOperations {
	public static void main(String[] args) {
		// Creating a TreeMap (Default Constructor - Natural Ordering of Keys)
		TreeMap<Integer, String> treeMap = new TreeMap<>();
		System.out.println("\nTreeMap successfully created!");

		// Adding elements to the TreeMap
		treeMap.put(10, "Geeks");
		treeMap.put(15, "4");
		treeMap.put(20, "Geeks");
		treeMap.put(25, "Welcomes");
		treeMap.put(30, "You");
		System.out.println("\nElements inserted successfully!");
		System.out.println("TreeMap: " + treeMap);

		// Accessing elements in TreeMap
		System.out.println("\nAccessing Elements:");
		System.out.println("Value for key 10: " + treeMap.get(10));
		System.out.println("First Key: " + treeMap.firstKey());
		System.out.println("Last Key: " + treeMap.lastKey());

		// Searching for a key
		int searchKey = 50;
		System.out.println("\nIs key " + searchKey + " present? " + treeMap.containsKey(searchKey));

		// Searching for a value
		String searchValue = "Geeks";
		System.out.println("Is value \"" + searchValue + "\" present? " + treeMap.containsValue(searchValue));

		// Removing an element
		treeMap.remove(15);
		System.out.println("\nElement with key 15 removed!");
		System.out.println("Updated TreeMap: " + treeMap);

		// Iterating through TreeMap
		System.out.println("\nIterating through TreeMap:");
		for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
			System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
		}

		// Creating a TreeMap using Comparator Constructor
		TreeMap<Student, Integer> studentTreeMap = new TreeMap<>(new SortByRoll());
		studentTreeMap.put(new Student(111, "John", "London"), 2);
		studentTreeMap.put(new Student(131, "Alice", "NYC"), 3);
		studentTreeMap.put(new Student(121, "Bob", "Paris"), 1);
		System.out.println("\nTreeMap using Comparator:");
		for (Map.Entry<Student, Integer> entry : studentTreeMap.entrySet()) {
			System.out.println(entry.getKey() + " => " + entry.getValue());
		}

		// Creating TreeMap from another Map (HashMap)
		Map<Integer, String> hashMap = new HashMap<>();
		hashMap.put(5, "Hello");
		hashMap.put(3, "World");
		hashMap.put(8, "Java");

		TreeMap<Integer, String> treeMapFromHashMap = new TreeMap<>(hashMap);
		System.out.println("\nTreeMap created from HashMap: " + treeMapFromHashMap);

		// Synchronizing TreeMap
		SortedMap<Integer, String> synchronizedTreeMap = Collections.synchronizedSortedMap(new TreeMap<>(treeMap));
		System.out.println("\nSynchronized TreeMap: " + synchronizedTreeMap);
	}
}

// Custom Student class with Comparable
class Student {
	int rollno;
	String name, address;

	public Student(int rollno, String name, String address) {
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}

	public String toString() {
		return this.rollno + " " + this.name + " " + this.address;
	}
}

// Comparator to sort TreeMap by roll number
class SortByRoll implements Comparator<Student> {
	public int compare(Student a, Student b) {
		return a.rollno - b.rollno;
	}
}
