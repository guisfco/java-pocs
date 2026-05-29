package com.guisfco;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @DisplayName("Should sum two numbers and return a result")
    @Test
    void shouldSumTwoNumbers() {
        var result = calculator.sum(2, 3);
        assertEquals(5, result);
    }

    @DisplayName("Should subtract two numbers and return a result")
    @Test
    void shouldSubtractTwoNumbers() {
        var result = calculator.subtract(10, 3);
        assertEquals(7, result);
    }

    @DisplayName("Should divide two numbers and return a result")
    @Test
    void shouldDivideTwoNumbers() {
        var result = calculator.divide(10, 5);
        assertEquals(2, result);
    }

    @DisplayName("When number is even then should return true")
    @Test
    void shouldReturnTrueWhenNumberIsEven() {
        assertTrue(calculator.isEven(2));
    }

    @DisplayName("When dividing by zero then should throw exception")
    @Test
    void shouldThrowExceptionWhenDividingByZero() {
        var exception = assertThrows(IllegalArgumentException.class, () -> calculator.divide(1, 0));
        assertEquals("Cannot divide by zero", exception.getMessage());
    }
}