package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.List;

public class ListOperations {

	public static void main(String[] args) {

		// Creating the first list and adding elements
		List<Integer> list1 = new ArrayList<>();
		list1.add(10);
		list1.add(20);
		list1.add(30);

		// Creating the second list and adding elements
		List<Integer> list2 = new ArrayList<>();
		list2.add(40);
		list2.add(50);

		// Adding all elements of list2 to list1 at index 1
		list1.addAll(1, list2);
		
		//Removing the value at index 2
		list1.remove(2);

		// Setting 0th index to value 5
		list1.set(0, 5);

		System.out.println("Final List1: " + list1);
	}

}
