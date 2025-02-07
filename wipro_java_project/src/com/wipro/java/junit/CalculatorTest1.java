package com.wipro.java.junit;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest1 {
    private final Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        int result = calculator.add(3, 2);
        assertEquals(5, result);
    }

    @Test
    public void testSubtract() {
        int result = calculator.subtract(5, 3);
        assertEquals(2, result);
    }

    @Test
    public void testAddWithNegativeNumbers() {
        int result = calculator.add(-3, -2);
        assertEquals(-5, result);
    }

    @Test
    public void testSubtractWithNegativeNumbers() {
        int result = calculator.subtract(-3, -2);
        assertEquals(-1, result);
    }
}
