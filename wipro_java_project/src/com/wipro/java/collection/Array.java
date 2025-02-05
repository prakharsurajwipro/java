package com.wipro.java.collection;

public class Array {
	public static void main(String[] args) {
		
	int [] arr ; //Declaring an integer array 
	
	arr=new int[3];   //Allocating memory of size 3
	
	arr[0]=2;      //Assigning value 2 to the first index
	arr[1]=3;      //Assigning value 3 to the second index
	arr[2]=9;       // Assigning value 9 to the third index
	
	for(int i=0;i<3;i++)
	{
	System.out.println(arr[i]);
	
	}
	}
}
