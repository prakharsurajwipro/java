/**
 * 
 */
package com.wipro.oops;

/**
 * @author prakhar
 */
/**
 * POJO (Plain old Java Object)
 *  No constructor 
 * Getters have return value
 * Setter have no return value
 * properties are determined using private fields
 * values are behaviors which are determined via setters
 * toString will convert the entire animal class with properties and behaviors 
 */
public class Employee {

	//Private properties =structure 
	private int empid;  // This is employee id
	private String name; // This is employee name
	private float salary;// This is employee salary
	
	
	//getter for empid
	public int getEmpid() {
		return empid;
	}

	//setter for empid
	public void setEmpid(int empid) {
		this.empid = empid;
	}

	//getter for empname
	public String getName() {
		return name;
	}

	//setter for empname
	public void setName(String name) {
		this.name = name;
	}

	//getter for empsalary
	public float getSalary() {
		return salary;
	}

	//setter for empsalary
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	
	 @Override
		public String toString()
		{
		 return "Employee{empid=" + empid + ", name='" + name + "', salary=" + salary + "}";		
		}

	/**
	 */
}
