/**
 * 
 */
package com.wipro.java.oops;

/**
 * @author prakhar
 */
/**
 * POJO (Plain old Java Object)
 * No constructor 
 * Getters have return value
 * Setter have no return value
 * properties are determined using private fields
 * values are behaviors which are determined via setters....
 * toString will convert the entire animal class with properties and behaviors.
 */ 
public class Animal {

	//Private properties =structure 
	
	private String name; //This is name of the animal
	private int age; // This is age of animal
	private float weight;// This is weight of animal
	
	//getter for Animal Name 
	public String getName() {
		return name;
	}

	//setter for Animal Name
	public void setName(String name) {
		this.name = "dog";
	}

	//getter for Animal agee
	public int getAge() {	
		return age;
	}

	//setter for Animal age
	public void setAge(int age) {
		this.age = 15;
	}

	//getter for Animal weight
	public float getWeight() {
		return weight;
	}

	//setter for Animal weight
	public void setWeight(float weight) {
		this.weight = 45f;
	}



	/**
	 * @param args
	 */
	
	 @Override
	public String toString()
	{
		 return "Animal{name='" + name + "', age=" + age + ", weightt= " + weight+ "}";
	}


}
