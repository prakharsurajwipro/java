/**
 * 
 */
package com.wipro.java;

/**
 * 
 */
public class MyClass {

	/**
	 * 
	 */
	   int num = 5;
	   
	    public void changeValue(int num) {

	        this.num = num;
	    }

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  MyClass obj = new MyClass(); //Creating object of MyClass and assigning to obj reference variable 

	        obj.changeValue(10); // Calling changeValue method and passing 10 as argument
	        //This updates instance variable num as 10

	        System.out.println(obj.num); //Prints the updated value of num,which is 10
	}

}
