package com.wipro.java.usecase2;

public interface StudentOperations {
    /**
     * All methods are by default public and abstract in an interface.
     */

    /*
     * Abstract Method to add the student details
     */
    void addStudent(Student s);

    /*
     * Overloaded method to add student details using individual parameters
     */
    void addStudent(String id, String name, int age, String address);

    /*
     * Method to delete the student details
     */
    void deleteStudent(String id);

    /*
     * Method to display all the student details
     */
    void displayStudents();

    /*
     * To search the student based on ID
     */
    void searchStudent(String id);

    /*
     * To update the student name based on ID
     */
    void updateName(String id, String newName);

    /*
     * To update the student address based on ID
     */
    void updateAddress(String id, String newAddress);

    /*
     * To update the student age based on ID
     */
    void updateAge(String id, int newAge);

    /*
     * To sort the student details based on Address in Ascending order
     */
    void sortByAddress();

    /*
     * To sort the student details based on Age in Descending order
     */
    void sortByAge();
}
