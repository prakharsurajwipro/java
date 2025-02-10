package com.wipro.java.usecase2;

import java.util.*;

public class StudentService implements StudentOperations {
    /*
     * Create Student List using ArrayList
     */
    private List<Student> students = new ArrayList<>();

    // Overloaded addStudent method (with parameters)
    @Override
    public void addStudent(String id, String name, int age, String address) {
        Student newStudent = new Student(id, name, age, address);
        addStudent(newStudent); // Reusing the previous method
    }

    /*
     * Method to add the student details
     */
    @Override
    public void addStudent(Student s) {
        students.add(s);
        System.out.println("Student details added successfully..............");
    }

    /*
     * Method to delete the student details
     */
    @Override
    public void deleteStudent(String id) {
        boolean removed = students.removeIf(student -> student.getStudentId().equals(id));
        System.out.println(removed ? "Student deleted successfully." : "Student ID not found.");
    }

    /*
     * Method to display all the student details
     */
    @Override
    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
        } else {
            System.out.println("Student List:");
            students.forEach(Student::displayDetails);
        }
    }

    /*
     * Method to search the student based on id
     */
    @Override
    public void searchStudent(String id) {
        students.stream()
            .filter(student -> student.getStudentId().equals(id))
            .findFirst()
            .ifPresentOrElse(
                Student::displayDetails,
                () -> System.out.println("Student ID not found.")
            );
    }

    /*
     * Method to update the student name based on id
     */
    @Override
    public void updateName(String id, String newName) {
        for (Student s : students) {
            if (s.getStudentId().equals(id)) {
                s.setName(newName);
                System.out.println("Name updated successfully.");
                return;
            }
        }
        System.out.println("Student ID not found.");
    }

    /*
     * Method to update the student address based on id
     */
    @Override
    public void updateAddress(String id, String newAddress) {
        for (Student s : students) {
            if (s.getStudentId().equals(id)) {
                s.setAddress(newAddress);
                System.out.println("Address updated successfully.");
                return;
            }
        }
        System.out.println("Student ID not found.");
    }

    /*
     * Method to update the student age based on id
     */
    @Override
    public void updateAge(String id, int newAge) {
        for (Student s : students) {
            if (s.getStudentId().equals(id)) {
                s.setAge(newAge);
                System.out.println("Age updated successfully.");
                return;
            }
        }
        System.out.println("Student ID not found.");
    }

    /*
     * Method to sort the student details based on Address in Ascending order
     */
    @Override
    public void sortByAddress() {
        students.sort(Comparator.comparing(Student::getAddress));
        System.out.println("Sorted by address (Ascending):");
        displayStudents();
    }

    /*
     * Method to sort the student details based on age in Descending order
     */
    @Override
    public void sortByAge() {
        students.sort(Comparator.comparingInt(Student::getAge).reversed());
        System.out.println("Sorted by age (Descending):");
        displayStudents();
    }
}
