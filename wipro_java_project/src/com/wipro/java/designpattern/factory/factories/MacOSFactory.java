package com.wipro.java.designpattern.factory.factories;

import com.wipro.java.designpattern.factory.buttons.Button;
import com.wipro.java.designpattern.factory.buttons.MacOSButton;
import com.wipro.java.designpattern.factory.checkboxes.Checkbox;
import com.wipro.java.designpattern.factory.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {

	@Override
	public Button createButton() {
		return new MacOSButton();
	}

	@Override
	public Checkbox createCheckbox() {
		return new MacOSCheckbox();
	}
}
