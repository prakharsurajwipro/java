/**
 * 
 */
package com.wipro.oops;

/**
 * @author prakharsurajwipro
 */
public class Flowers {

	
	String name; // This is for storing name of flower
	String color;// This is for storing color of flower
	
	Flowers(String name,String color) //Constructor to initialize value
	{
		
		this.name=name;  
		this.color=color;
		
	}
	
	//Displays the details of the flower.
	
	void display()
	{
		System.out.println("Flower name: "+name +", Flower Color: "+color);	
	}
	
	public static void main(String[] args) {
	
		 // Creating flower objects with different names and colors
		
		Flowers flower1=new Flowers("Rose","Red");
		Flowers flower2=new Flowers("Lily","White");
		Flowers flower3=new Flowers("Sunflower","Yellow");	
		
		
		 // Displaying flower details
		
		flower1.display();
		flower2.display();
		flower3.display();
	}

}
