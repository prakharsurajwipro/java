package com.wipro.java.collection;

import java.util.LinkedList;

public class LinkedList1 { 
    public static void main(String[] args) {
        int n = 10; 
        LinkedList<Integer> ll = new LinkedList<>();

        // Adding elements to LinkedList
        for (int i = 1; i <= n; i++)
            ll.add(i);

        // Printing elements
        System.out.println("LinkedList: " + ll);

        // Remove element at index 3
        ll.remove(3); 

        // Displaying the list after deletion
        System.out.println("After deletion: " + ll);

        // Printing elements one by one
        for (int i = 0; i < ll.size(); i++)
            System.out.print(ll.get(i) + " ");
    }
}
