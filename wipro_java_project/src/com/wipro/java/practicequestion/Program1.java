package com.wipro.java.practicequestion;

import java.util.Scanner;

public class Program1 {

    public static int countPairs(int N, int[] A) {
        int count = 0;

        // Iterate over all pairs (i, j) where i < j
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                int minHeight = Math.min(A[i], A[j]);
                boolean isValid = true;

                // Check elements between i and j
                for (int k = i + 1; k < j; k++) {
                    if (A[k] >= minHeight) {
                        isValid = false;
                        break;
                    }
                }

                // If valid, count the pair
                if (isValid) {
                    count++;
                }
            }
        }

        return count;
    }

    // Non-editable starts here
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int N = Integer.parseInt(scanner.nextLine());
            if (N <= 0) {
                throw new IllegalArgumentException("Array length must be greater than 0");
            }
            int[] A = new int[N];
            String[] temp = scanner.nextLine().split(" ");

            if (temp.length != N) {
                throw new IllegalArgumentException("Incorrect number of elements provided");
            }

            for (int i = 0; i < N; i++) {
                A[i] = Integer.parseInt(temp[i]);
            }

            System.out.println(countPairs(N, A));
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter integers only.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}