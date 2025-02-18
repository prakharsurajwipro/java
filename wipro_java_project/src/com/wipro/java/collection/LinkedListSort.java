package com.wipro.java.collection;

import java.util.*;

class Person {
    int id;
    String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name;
    }
}

// Comparator to sort by ID
class SortById implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return Integer.compare(p1.id, p2.id);
    }
}

public class LinkedListSort {
    public static void main(String[] args) {
        LinkedList<Person> list = new LinkedList<>();

        // Adding elements to the LinkedList
        list.add(new Person(3, "Alice"));
        list.add(new Person(1, "Bob"));
        list.add(new Person(2, "Charlie"));

        System.out.println("Before Sorting:");
        for (Person p : list) {
            System.out.println(p);
        }

        // Sorting the LinkedList using Comparator
        list.sort(new SortById());

        System.out.println("\nAfter Sorting by ID:");
        for (Person p : list) {
            System.out.println(p);
        }
    }
}

