package com.wipro.java.java8.usecase;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public class EmployeeServiceTest {

    private EmployeeService service;

    @BeforeEach
    void setUp() {
        // Initialize a new EmployeeService instance before each test case
        service = new EmployeeService();
        service.addEmployee(new Employee(1, "Prakhar", "IT", 60000, LocalDate.of(2022, 5, 10)));
        service.addEmployee(new Employee(2, "Hriday", "HR", 50000, LocalDate.of(2021, 3, 15)));
    }

    @Test
    void testAddEmployee() {
        int initialSize = service.getEmployees().size();
        service.addEmployee(new Employee(3, "Alina", "Finance", 55000, LocalDate.of(2023, 6, 1)));
        assertEquals(initialSize + 1, service.getEmployees().size(), "Employee count should increase after adding.");
    }

    @Test
    void testRemoveEmployee() {
        service.removeEmployee(1);
        assertEquals(1, service.getEmployees().size(), "Employee list size should decrease after removal.");
    }

    @Test
    void testSearchEmployee() {
        Optional<Employee> emp = service.searchEmployee(1);
        assertTrue(emp.isPresent(), "Employee should be found.");
        assertEquals("Prakhar", emp.get().getEmpName(), "Employee name should match.");
    }

    @Test
    void testUpdateSalary() {
        service.updateSalary(1, 70000);
        Optional<Employee> emp = service.searchEmployee(1);
        assertTrue(emp.isPresent(), "Employee should exist.");
        assertEquals(70000, emp.get().getSalary(), "Salary should be updated.");
    }

    @Test
    void testFilterByDepartment() {
        List<Employee> hrEmployees = service.filterByDepartment("HR");
        assertEquals(1, hrEmployees.size(), "Only one HR employee should exist.");
        assertEquals("Hriday", hrEmployees.get(0).getEmpName(), "HR employee should be Hriday.");
    }

    @Test
    void testSortByName() {
        List<Employee> sortedEmployees = service.sortByName();
        assertEquals("Hriday", sortedEmployees.get(0).getEmpName(), "Hriday should be the first employee in sorted order.");
        assertEquals("Prakhar", sortedEmployees.get(1).getEmpName(), "Prakhar should be the second employee.");
    }

    @Test
    void testGetAverageSalary() {
        double avgSalary = service.getAverageSalary();
        assertEquals(55000, avgSalary, "Average salary should be correctly calculated.");
    }
}
