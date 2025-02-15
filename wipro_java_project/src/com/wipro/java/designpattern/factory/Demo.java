package com.wipro.java.designpattern.factory;

import com.wipro.java.designpattern.factory.app.Application;
import com.wipro.java.designpattern.factory.factories.GUIFactory;
import com.wipro.java.designpattern.factory.factories.MacOSFactory;
import com.wipro.java.designpattern.factory.factories.WindowsFactory;

public class Demo {
    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }
        
        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
