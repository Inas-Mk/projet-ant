package com.app;

import org.junit.Test;
import static org.junit.Assert.*;


public class CalculatorTest {
    Calculator calc = new Calculator();

    @Test
    public void testAddition() {
        assertEquals(15, calc.add(10, 5))}
    @Test
    public void testSoustraction() {
        assertEquals(5, calc.subtract(10, 5));}
    @Test
    public void testMultiplication() {
        assertEquals(50, calc.multiply(10, 5));}
    @Test
    public void testDivision() {
        assertEquals(2, calc.divide(10, 5));
    }
    @Test(expected = IllegalArgumentException.class)
    public void testDivisionParZero() {
        calc.divide(10, 0);
    }
}
