package com.wipro.java.designpattern.factory.factories;

import com.wipro.java.designpattern.factory.buttons.Button;
import com.wipro.java.designpattern.factory.buttons.WindowsButton;
import com.wipro.java.designpattern.factory.checkboxes.Checkbox;
import com.wipro.java.designpattern.factory.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {

	@Override
	public Button createButton() {
		return new WindowsButton();
	}

	@Override
	public Checkbox createCheckbox() {
		return new WindowsCheckbox();
	}
}
