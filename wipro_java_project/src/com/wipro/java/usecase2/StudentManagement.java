package com.wipro.java.usecase2;

import java.util.Scanner;

public class StudentManagement {
    public static void main(String[] args) {

        System.out.println("Welcome to the Student Management Application");
        System.out.println();

        /*
         * Creating object for StudentService class
         */
        StudentService stuService = new StudentService();

        // Adding some default students
        stuService.addStudent(new Student("111", "Prakhar Suraj", 22, "Bengaluru"));
        stuService.addStudent(new Student("222", "Hriday", 21, "Bengaluru"));

        /*
         * Taking input from user
         */
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n_Student Management System_");
            System.out.println("1. Add student");
            System.out.println("2. Delete student");
            System.out.println("3. Display students");
            System.out.println("4. Search student");
            System.out.println("5. Update student Name");
            System.out.println("6. Update student Address");
            System.out.println("7. Update student Age");
            System.out.println("8. Sort the student details by Address (Ascending)");
            System.out.println("9. Sort the student details by Age (Descending)");
            System.out.println("10. Exit");
            
            /*
             * Enter the choice based on user requirement
             */
            System.out.print("\nPlease enter your choice: ");
            
            // Ensuring valid integer input
            while (!sc.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number between 1 and 10.");
                sc.next();
            }
            
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("\n_Add Student Details_");
                    System.out.print("Enter Student ID: ");
                    String id = sc.next();
                    sc.nextLine(); // Consume newline
                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Student Age: ");
                    
                    while (!sc.hasNextInt()) {
                        System.out.println("Invalid input! Age must be a number.");
                        sc.next();
                    }
                    
                    int age = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    System.out.print("Enter Student Address: ");
                    String addr = sc.nextLine();
                    stuService.addStudent(id, name, age, addr);
                    break;

                case 2:
                    System.out.print("\nEnter Student ID to delete: ");
                    String idToDelete = sc.next();
                    stuService.deleteStudent(idToDelete);
                    break;

                case 3:
                    System.out.println("\n_Displaying all students_");
                    stuService.displayStudents();
                    break;

                case 4:
                    System.out.print("\nEnter Student ID to search: ");
                    String idToSearch = sc.next();
                    stuService.searchStudent(idToSearch);
                    break;

                case 5:
                    System.out.print("\nEnter Student ID to update name: ");
                    String idToUpdateName = sc.next();
                    sc.nextLine(); // Consume newline
                    System.out.print("Enter new Name: ");
                    String newName = sc.nextLine();
                    stuService.updateName(idToUpdateName, newName);
                    break;

                case 6:
                    System.out.print("\nEnter Student ID to update address: ");
                    String idToUpdateAddress = sc.next();
                    sc.nextLine(); // Consume newline
                    System.out.print("Enter new Address: ");
                    String newAddress = sc.nextLine();
                    stuService.updateAddress(idToUpdateAddress, newAddress);
                    break;

                case 7:
                    System.out.print("\nEnter Student ID to update age: ");
                    String idToUpdateAge = sc.next();
                    System.out.print("Enter new Age: ");
                    
                    while (!sc.hasNextInt()) {
                        System.out.println("Invalid input! Age must be a number.");
                        sc.next();
                    }
                    
                    int newAge = sc.nextInt();
                    stuService.updateAge(idToUpdateAge, newAge);
                    break;

                case 8:
                    stuService.sortByAddress();
                    break;

                case 9:
                    stuService.sortByAge();
                    break;

                case 10:
                    System.out.println("\n_Exiting the application. Thank you!_");
                    sc.close();
                    return;

                default:
                    System.out.println("\nInvalid choice! Please enter a number between 1 and 10.");
            }
        }
    }
}
