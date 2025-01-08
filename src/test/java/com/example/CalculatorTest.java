package com.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Calculator Tests")
class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Nested
    @DisplayName("Addition Tests")
    class AdditionTests {

        @ParameterizedTest(name = "Adding {0} and {1} should equal {2}")
        @CsvSource({
            "1, 1, 2",
            "-1, -1, -2",
            "0, 5, 5",
            "1000000, 2000000, 3000000"
        })
        void testAddition(int a, int b, int expected) {
            assertEquals(expected, calculator.add(a, b), "Addition failed");
        }
    }

    @Nested
    @DisplayName("Subtraction Tests")
    class SubtractionTests {

        @ParameterizedTest(name = "Subtracting {1} from {0} should equal {2}")
        @CsvSource({
            "5, 3, 2",
            "0, 0, 0",
            "-5, -3, -2",
            "1000000, 1, 999999"
        })
        void testSubtraction(int a, int b, int expected) {
            assertEquals(expected, calculator.subtract(a, b), "Subtraction failed");
        }
    }

    @Nested
    @DisplayName("Multiplication Tests")
    class MultiplicationTests {

        @ParameterizedTest(name = "Multiplying {0} and {1} should equal {2}")
        @CsvSource({
            "3, 2, 6",
            "-3, -2, 6",
            "-3, 2, -6",
            "0, 10, 0"
        })
        void testMultiplication(int a, int b, int expected) {
            assertEquals(expected, calculator.multiply(a, b), "Multiplication failed");
        }
    }

    @Nested
    @DisplayName("Division Tests")
    class DivisionTests {

        @ParameterizedTest(name = "Dividing {0} by {1} should equal {2}")
        @CsvSource({
            "10, 2, 5",
            "-10, -2, 5",
            "-10, 2, -5",
            "0, 5, 0"
        })
        void testDivision(int a, int b, int expected) {
            assertEquals(expected, calculator.divide(a, b), "Division failed");
        }

        @Test
        @DisplayName("Division by zero should throw ArithmeticException")
        void testDivisionByZero() {
            assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0), "Division by zero did not throw");
        }
    }
}
