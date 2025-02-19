package com.wipro.java.collection.treemap;


import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class FiboTreeMap1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of Fibonacci terms: ");
        int n = scanner.nextInt();
        scanner.close();

        TreeMap<Integer, Long> fibonacciMap = new TreeMap<>();
        generateFibonacci(n, fibonacciMap);

        System.out.println("Fibonacci Series stored in TreeMap::");
        for (Map.Entry<Integer, Long> entry : fibonacciMap.entrySet()) {
            System.out.println("Term: " + entry.getKey() + " -> " + entry.getValue());
        }
    }

    private static void generateFibonacci(int n, TreeMap<Integer, Long> fibonacciMap) {
        long first = 0, second = 1;
        for (int i = 1; i <= n; i++) {
            fibonacciMap.put(i, first);
            long next = first + second;
            first = second;
            second = next;
        }
    }
}
