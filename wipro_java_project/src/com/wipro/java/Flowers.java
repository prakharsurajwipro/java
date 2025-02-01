/**
 * 
 */
package com.wipro.java;

/**
 * @author prakharsurajwipro
 */
public class Flowers {

	
	String name;
	String color;
	
	Flowers(String name,String color)
	{
		
		this.name=name;
		this.color=color;
		
	}
	
	void display()
	{
		System.out.println("Flower name: "+name +", Flower Color: "+color);	
	}
	
	public static void main(String[] args) {
	
		Flowers flower1=new Flowers("Rose","Red");
		Flowers flower2=new Flowers("Lily","White");
		Flowers flower3=new Flowers("Sunflower","Yellow");	
		
		flower1.display();
		flower2.display();
		flower3.display();
	}

}
