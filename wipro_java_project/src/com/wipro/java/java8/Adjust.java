package com.wipro.java.java8;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Adjust {

    // Function to check date adjustments according to requirement
    public static void checkingAdjusters() {
        LocalDate today = LocalDate.now();
        System.out.println("Current Date: " + today);

        // Gets the first day of next month
        LocalDate firstDayNextMonth = today.with(TemporalAdjusters.firstDayOfNextMonth());
        System.out.println("First Day of Next Month: " + firstDayNextMonth);

        // Gets the next Saturday from today
        LocalDate nextSaturday = today.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
        System.out.println("Next Saturday from now: " + nextSaturday);

        // Gets the first day of the current month
        LocalDate firstDayOfMonth = today.with(TemporalAdjusters.firstDayOfMonth());
        System.out.println("First Day of Current Month: " + firstDayOfMonth);

        // Gets the last day of the current month
        LocalDate lastDayOfMonth = today.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println("Last Day of Current Month: " + lastDayOfMonth);
    }

    // Driver code
    public static void main(String[] args) {
        checkingAdjusters();
    }
}
