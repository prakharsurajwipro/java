package com.wipro.java.designpattern.builder.components;

public class GPSNavigator {
    private String route;

    public GPSNavigator() {
        this.route = "Default Route";
    }

    public GPSNavigator(String manualRoute) {
        this.route = manualRoute;
    }
}
