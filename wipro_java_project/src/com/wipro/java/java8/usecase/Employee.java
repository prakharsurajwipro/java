package com.wipro.java.java8.usecase;

import java.time.LocalDate;

public class Employee {
    /*
     * Private properties of Employee class
     */
    private int empId;
    private String empName;
    private String department;
    private double salary;
    private LocalDate joiningDate;

    /*
     * Parameterized constructor
     */
    public Employee(int empId, String empName, String department, double salary, LocalDate joiningDate) {
        try {
            this.empId = empId;
            this.empName = empName;
            this.department = department;
            this.salary = salary;
            this.joiningDate = joiningDate;
        } catch (Exception e) {
            System.out.println("Error initializing Employee: " + e.getMessage());
        }
    }
    
    /*
     * Getters and Setters
     */
    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        try {
            this.empName = empName;
        } catch (Exception e) {
            System.out.println("Error setting Employee Name: " + e.getMessage());
        }
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        try {
            this.department = department;
        } catch (Exception e) {
            System.out.println("Error setting Department: " + e.getMessage());
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        try {
            this.salary = salary;
        } catch (Exception e) {
            System.out.println("Error setting Salary: " + e.getMessage());
        }
    }

    public LocalDate getJoiningDate() {
        return joiningDate;
    }

    /*
     * toString method to print all the details of the employee
     */
    @Override
    public String toString() {
        try {
            return "Employee [empId=" + empId + ", empName=" + empName + ", department=" + department + 
                    ", salary=" + salary + ", joiningDate=" + joiningDate + "]";
        } catch (Exception e) {
            return "Error retrieving Employee details: " + e.getMessage();
        }
    }
}
