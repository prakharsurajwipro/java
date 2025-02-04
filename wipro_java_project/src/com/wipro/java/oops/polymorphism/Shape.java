package com.wipro.java.oops.polymorphism;

//PARENT CLASS FOR POLYMORPHISM EVALUATION PROGRAM
class Shape {
	private String color;
	private int borderWidth;

	// Getter methods
	public String getColor() {
		return color;
	}

	public int getBorderWidth() {
		return borderWidth;
	}

	// Setter methods
	public void setColor(String color) {
		this.color = color;
	}

	public void setBorderWidth(int borderWidth) {
		this.borderWidth = borderWidth;
	}

	// Method to be overridden (Polymorphism)
	public void draw() {
		System.out.println("Color: " + color);
		System.out.println("Border Width: " + borderWidth);
	}
}
