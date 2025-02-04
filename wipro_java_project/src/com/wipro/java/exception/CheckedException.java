package com.wipro.java.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckedException {
    public static void main(String[] args) {
        try {
            // Trying to open a file that does not exist
            File file = new File("nonexistent_file.txt");
            Scanner scanner = new Scanner(file);     // This will throw FileNotFoundException
        } catch (FileNotFoundException e) {
            System.out.println("File not found! Please check the file path.");
        }
    }
}
