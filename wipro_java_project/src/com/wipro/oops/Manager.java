package com.wipro.oops;

/**
 * Parent class=Employee
 * Child class=Manager
 * Extends is Keyword
 */

public class Manager extends Employee{


	public Manager() {
		// TODO Auto-generated constructor stub
	}
  public static void main(String a[])
  {
	  
	  //Child object is instantiated from child constructor 
	  //Parent Class consumes the properties and behaviors of child class
	  
	  Employee employee=new Manager();
	  employee.setEmpid(4321);
	  employee.setName("prakhar");
	  employee.setSalary(34000f);
	  
	  System.out.println(employee.getEmpid());
	  System.out.println(employee.getName());
	  System.out.println(employee.getSalary());
  }
}
