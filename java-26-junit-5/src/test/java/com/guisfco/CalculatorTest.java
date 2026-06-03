package com.guisfco;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @BeforeAll
    static void beforeAll() {
        System.out.println("Runs once before all tests");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("Runs before each test");
    }

    @AfterEach
    void afterEach() {
        System.out.println("Runs after each test");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("Runs once after all tests");
    }

    @Nested
    @DisplayName("Sum tests")
    class SumTests {

        @DisplayName("Should sum two numbers and return a result")
        @Test
        void shouldSumTwoNumbers() {
            var result = calculator.sum(2, 3);
            assertEquals(5, result);
        }

        @DisplayName("Should sum numbers and return result")
        @ParameterizedTest(name = "{0} + {1} = {2}")
        @MethodSource("com.guisfco.CalculatorTest#sumProvider")
        void shouldSumTwoNumbers(int a, int b, int expected) {
            assertEquals(expected, calculator.sum(a, b));
        }
    }

    @Nested
    @DisplayName("Subtract tests")
    class SubtractTests {

        @DisplayName("Should subtract two numbers and return a result")
        @Test
        void shouldSubtractTwoNumbers() {
            var result = calculator.subtract(10, 3);
            assertEquals(7, result);
        }
    }

    @Nested
    @DisplayName("Divide tests")
    class DivideTests {

        @DisplayName("Should divide two numbers and return a result")
        @Test
        void shouldDivideTwoNumbers() {
            var result = calculator.divide(10, 5);
            assertEquals(2, result);
        }

        @DisplayName("When dividing by zero then should throw exception")
        @Test
        void shouldThrowExceptionWhenDividingByZero() {
            var exception = assertThrows(IllegalArgumentException.class, () -> calculator.divide(1, 0));
            assertEquals("Cannot divide by zero", exception.getMessage());
        }
    }

    @Nested
    @DisplayName("Even number tests")
    class EvenNumberTests {

        @DisplayName("When number is even then should return true")
        @Test
        void shouldReturnTrueWhenNumberIsEven() {
            assertTrue(calculator.isEven(2));
        }

        @DisplayName("Should return true for even numbers")
        @ParameterizedTest(name = "when number is {0}")
        @ValueSource(ints = {2, 4, 6, 8, 10})
        void shouldReturnTrueForEvenNumbers(int number) {
            assertTrue(calculator.isEven(number));
        }

        @DisplayName("Should return false for odd numbers")
        @ParameterizedTest(name = "when number is {0}")
        @MethodSource("com.guisfco.CalculatorTest#oddNumbers")
        void shouldReturnFalseForOddNumbers(int number) {
            assertFalse(calculator.isEven(number));
        }
    }

    private static Stream<Arguments> oddNumbers() {
        return Stream.of(
                Arguments.of(1),
                Arguments.of(3),
                Arguments.of(5),
                Arguments.of(7),
                Arguments.of(9)
        );
    }

    private static Stream<Arguments> sumProvider() {
        return Stream.of(
                Arguments.of(1, 3, 4),
                Arguments.of(5, 6, 11),
                Arguments.of(4, 9, 13),
                Arguments.of(2, 4, 6),
                Arguments.of(0, 1, 1)
        );
    }
}