package com.wipro.oops;


/**
 * Parent class=Employee
 * Child class=ProjectLead
 * Extends is a Keyword
 */

public class ProjectLead extends Employee{

	public ProjectLead() {
		// TODO Auto-generated constructor stub
	}
  /**
 * @param a
 */
public static void main(String a[])
  {
	  //Child object is instantiated from child constructor 
	  //Parent Class consumes the properties and behaviors of child class

	 Employee employee=new ProjectLead();
	  employee.setEmpid(1234);
	  employee.setName("prakhar");
	  employee.setSalary(24000f);
	  
	  System.out.println(employee.getEmpid());
	  System.out.println(employee.getName());
	  System.out.println(employee.getSalary());
	   
  }
}
