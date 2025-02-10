package com.wipro.java.usecase2;

/*
 * Parent class : Person
 * Child class : Student
 */
public class Student extends Person {

    // Private properties of Student class
    private String studentId;
    private final String collegeName = "Sapthagiri College Of Engineering";

    // Parameterized constructor
    public Student(String studentId, String name, int age, String address) {
        super(name, age, address);
        this.studentId = studentId;
    }

    // Getters
    public String getStudentId() {
        return studentId;
    }

    public String getCollegeName() {
        return collegeName;
    }

    // Overriding the abstract method from Person class
    @Override
    public void displayDetails() {
        System.out.println("Student [ID=" + studentId + ", Name=" + getName() + ", Age=" + getAge() +
                ", Address=" + getAddress() + ", College=" + collegeName + "]");
    }
}
