package com.wipro.java.collection.hashmap;
import java.util.*;
import java.util.LinkedList;

class CustomHashMap<K, V> {
    private static final int INITIAL_CAPACITY = 10; // Default size of HashMap
    private LinkedList<Entry<K, V>>[] buckets; // Array of linked lists (separate chaining)
    private int size; // Number of key-value pairs

    // Entry class to store key-value pairs
    static class Entry<K, V> {
        K key;
        V value;

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    // Constructor
    public CustomHashMap() {
        buckets = new LinkedList[INITIAL_CAPACITY];
        for (int i = 0; i < INITIAL_CAPACITY; i++) {
            buckets[i] = new LinkedList<>();
        }
        size = 0;
    }

    // Hash function to determine the bucket index
    private int getBucketIndex(K key) {
        return Math.abs(key.hashCode()) % INITIAL_CAPACITY;
    }

    // PUT method: Insert or update a key-value pair
    public void put(K key, V value) {
        int index = getBucketIndex(key);
        LinkedList<Entry<K, V>> bucket = buckets[index];

        for (Entry<K, V> entry : bucket) {
            if (entry.key.equals(key)) {
                entry.value = value; // Update value if key exists
                return;
            }
        }

        bucket.add(new Entry<>(key, value)); // Add new entry if key does not exist
        size++;
    }

    // GET method: Retrieve value by key
    public V get(K key) {
        int index = getBucketIndex(key);
        LinkedList<Entry<K, V>> bucket = buckets[index];

        for (Entry<K, V> entry : bucket) {
            if (entry.key.equals(key)) {
                return entry.value;
            }
        }
        return null; // Key not found
    }

    // REMOVE method: Delete key-value pair
    public void remove(K key) {
        int index = getBucketIndex(key);
        LinkedList<Entry<K, V>> bucket = buckets[index];

        Entry<K, V> toRemove = null;
        for (Entry<K, V> entry : bucket) {
            if (entry.key.equals(key)) {
                toRemove = entry;
                break;
            }
        }

        if (toRemove != null) {
            bucket.remove(toRemove);
            size--;
        }
    }

    // CONTAINS KEY method: Check if key exists
    public boolean containsKey(K key) {
        int index = getBucketIndex(key);
        LinkedList<Entry<K, V>> bucket = buckets[index];

        for (Entry<K, V> entry : bucket) {
            if (entry.key.equals(key)) {
                return true;
            }
        }
        return false;
    }

    // SIZE method: Return the number of key-value pairs
    public int size() {
        return size;
    }

    // DISPLAY method: Print the HashMap
    public void display() {
        System.out.println("Custom HashMap Contents:");
        for (int i = 0; i < INITIAL_CAPACITY; i++) {
            if (!buckets[i].isEmpty()) {
                System.out.print("Bucket " + i + ": ");
                for (Entry<K, V> entry : buckets[i]) {
                    System.out.print("[" + entry.key + " -> " + entry.value + "] ");
                }
                System.out.println();
            }
        }
    }
}

// Main Class to Test Custom HashMap
public class HashMapImplementation {
    public static void main(String[] args) {
        CustomHashMap<Integer, String> map = new CustomHashMap<>();

        // Insert key-value pairs
        map.put(1, "Alice");
        map.put(2, "Bob");
        map.put(12, "Charlie"); // Collision (since 12 % 10 == 2)

        // Display HashMap
        map.display();

        // Get value by key
        System.out.println("\nGet Key 2: " + map.get(2)); // Output: Bob

        // Remove a key
        map.remove(2);
        System.out.println("\nAfter removing key 2:");
        map.display();

        // Check if key exists
        System.out.println("\nContains Key 12? " + map.containsKey(12)); // true

        // Print size
        System.out.println("Size of HashMap: " + map.size()); // 2
    }
}
