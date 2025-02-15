package com.wipro.java.designpattern.factory.app;



import com.wipro.java.designpattern.factory.buttons.Button;
import com.wipro.java.designpattern.factory.checkboxes.Checkbox;
import com.wipro.java.designpattern.factory.factories.GUIFactory;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
