package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    void testAdd() {
        assertEquals(5, calc.add( 2,  3));
    }

    @Test
    void testSub() {
        assertEquals(5, calc.sub(8, 3));
    }

    @Test
    void testMul() {
        assertEquals(6, calc.mul(2,  3));
    }

    @Test
    void testDivWithZero() {
        assertThrows(ArithmeticException.class, () -> {calc.div(2,  0);});
    }

    @Test
    void testDiv() {
        assertEquals(5, calc.div(10,  2));
    }
}