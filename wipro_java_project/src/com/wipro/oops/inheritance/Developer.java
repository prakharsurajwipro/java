package com.wipro.oops.inheritance;

/**
 * Parent class=Employee
 * Child class=Developer
 * Extends is a Keyword
 */


public class Developer extends Employee{

	public Developer() {
		// TODO Auto-generated constructor stub
	}
	
	  //Child object is instantiated from child constructor 
	  //Parent Class consumes the properties and behaviors of child class
	  public static void main(String a[])
	  {
		  
		  Employee employee=new Developer();
		  employee.setEmpid(3321);
		  employee.setName("prakharsuraj");
		  employee.setSalary(24000f);
		  
		  System.out.println(employee.getEmpid());
		  System.out.println(employee.getName());
		  System.out.println(employee.getSalary());
	  }
}
