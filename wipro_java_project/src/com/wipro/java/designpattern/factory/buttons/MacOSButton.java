package com.wipro.java.designpattern.factory.buttons;

public class MacOSButton implements Button {
	@Override
	public void paint() {
		System.out.println("You have created MacOSButton.");
	}
}