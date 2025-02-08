package com.wipro.java.java8.usecase;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class EmployeeManagement {
    public static void main(String[] args) {

        /*
         * Creating object for EmployeeService
         */
        EmployeeService service = new EmployeeService();

        /*
         * Taking input from the user
         */
        Scanner scanner = new Scanner(System.in);

        // Add some employees for reference
        service.addEmployee(new Employee(1, "Prakhar", "IT", 50000, LocalDate.of(2023, 5, 10)));
        service.addEmployee(new Employee(2, "Hriday", "HR", 45000, LocalDate.of(2018, 3, 15)));

        while (true) {
            System.out.println("Employee Management System");
            System.out.println("");

            /*
             * All operations
             */
            System.out.println("1. Add Employee");
            System.out.println("2. Remove Employee");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Salary");
            System.out.println("5. Display All Employees");
            System.out.println("6. Filter by Department");
            System.out.println("7. Sort by Name");
            System.out.println("8. Get Average Salary");
            System.out.println("9. Exit");

            /*
             * Taking choice from the user
             */
            System.out.print("Enter your choice: ");

            if (!scanner.hasNextInt()) {  // Check if input is a valid integer
                System.out.println("Invalid input! Please enter a valid choice.");
                scanner.next();  // Consume invalid input
                continue;
            }

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            /*
             * Using switch case for implementing the operations
             */
            switch (choice) {

                /*
                 * To add an Employee
                 */
                case 1:
                    try {
                        System.out.print("Enter ID: ");
                        if (!scanner.hasNextInt()) {
                            throw new InputMismatchException("ID must be an integer.");
                        }
                        int id = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Enter Name: ");
                        String name = scanner.nextLine();
                        if (name.isEmpty()) {
                            throw new IllegalArgumentException("Name cannot be empty.");
                        }

                        System.out.print("Enter Department: ");
                        String dept = scanner.nextLine();
                        if (dept.isEmpty()) {
                            throw new IllegalArgumentException("Department cannot be empty.");
                        }

                        System.out.print("Enter Salary: ");
                        if (!scanner.hasNextDouble()) {
                            throw new InputMismatchException("Salary must be a number.");
                        }
                        double salary = scanner.nextDouble();
                        if (salary < 0) {
                            throw new IllegalArgumentException("Salary cannot be negative.");
                        }

                        service.addEmployee(new Employee(id, name, dept, salary, LocalDate.now()));
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input! " + e.getMessage());
                        scanner.nextLine(); // Consume invalid input
                    } catch (IllegalArgumentException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                /*
                 * To remove an employee based on ID
                 */
                case 2:
                    try {
                        System.out.print("Enter Employee ID to Remove: ");
                        if (!scanner.hasNextInt()) {
                            throw new InputMismatchException("ID must be an integer.");
                        }
                        int removeId = scanner.nextInt();
                        service.removeEmployee(removeId);
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input! " + e.getMessage());
                        scanner.nextLine();
                    }
                    break;

                /*
                 * To search for an employee based on ID
                 */
                case 3:
                    try {
                        System.out.print("Enter Employee ID to Search: ");
                        if (!scanner.hasNextInt()) {
                            throw new InputMismatchException("ID must be an integer.");
                        }
                        int searchId = scanner.nextInt();
                        Optional<Employee> emp = service.searchEmployee(searchId);
                        if (emp.isPresent()) {
                            System.out.println(emp.get());
                        } else {
                            System.out.println("Error: Employee with ID " + searchId + " not found.");
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input! " + e.getMessage());
                        scanner.nextLine();
                    }
                    break;

                /*
                 * To update salary based on ID
                 */
                case 4:
                    try {
                        System.out.print("Enter Employee ID to Update Salary: ");
                        if (!scanner.hasNextInt()) {
                            throw new InputMismatchException("ID must be an integer.");
                        }
                        int updateId = scanner.nextInt();

                        System.out.print("Enter New Salary: ");
                        if (!scanner.hasNextDouble()) {
                            throw new InputMismatchException("Salary must be a number.");
                        }
                        double newSalary = scanner.nextDouble();
                        if (newSalary < 0) {
                            throw new IllegalArgumentException("Salary cannot be negative.");
                        }

                        service.updateSalary(updateId, newSalary);
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input! " + e.getMessage());
                        scanner.nextLine();
                    } catch (IllegalArgumentException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                /*
                 * To display all employees
                 */
                case 5:
                    service.displayEmployees();
                    break;

                /*
                 * Filter based on department
                 */
                case 6:
                    try {
                        System.out.print("Enter Department: ");
                        String department = scanner.nextLine();
                        if (department.isEmpty()) {
                            throw new IllegalArgumentException("Department name cannot be empty.");
                        }
                        List<Employee> filtered = service.filterByDepartment(department);
                        if (filtered.isEmpty()) {
                            System.out.println("No employees found in department: " + department);
                        } else {
                            filtered.forEach(System.out::println);
                        }
                    } catch (IllegalArgumentException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                /*
                 * Sorting based on Names
                 */
                case 7:
                    List<Employee> sorted = service.sortByName();
                    if (sorted.isEmpty()) {
                        System.out.println("No employees available to sort.");
                    } else {
                        sorted.forEach(System.out::println);
                    }
                    break;

                /*
                 * Calculating average salary
                 */
                case 8:
                    double avgSalary = service.getAverageSalary();
                    if (avgSalary == 0.0) {
                        System.out.println("No employees available to calculate the average salary.");
                    } else {
                        System.out.println("Average Salary: " + avgSalary);
                    }
                    break;

                /*
                 * To exit from the application
                 */
                case 9:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                /*
                 * Default case for invalid input
                 */
                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
            }
        }
    }
}
