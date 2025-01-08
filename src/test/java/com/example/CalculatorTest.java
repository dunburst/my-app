package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    // Kiểm thử phép cộng
    @Test
    public void testAddition() {
        assertEquals(5, calculator.add(2, 3));
        assertEquals(Integer.MAX_VALUE, calculator.add(Integer.MAX_VALUE, 0));
        assertEquals(Integer.MIN_VALUE, calculator.add(Integer.MIN_VALUE, 0));
    }

    // Kiểm thử phép trừ
    @Test
    public void testSubtraction() {
        assertEquals(-1, calculator.subtract(2, 3));
        assertEquals(0, calculator.subtract(Integer.MAX_VALUE, Integer.MAX_VALUE));
        assertEquals(0, calculator.subtract(Integer.MIN_VALUE, Integer.MIN_VALUE));
    }

    // Kiểm thử phép nhân
    @Test
    public void testMultiplication() {
        assertEquals(6, calculator.multiply(2, 3));
        assertEquals(0, calculator.multiply(0, Integer.MAX_VALUE));
        assertEquals(Integer.MAX_VALUE, calculator.multiply(Integer.MAX_VALUE, 1));
        assertEquals(Integer.MIN_VALUE, calculator.multiply(Integer.MIN_VALUE, 1));
    }

    // Kiểm thử phép chia
    @Test
    public void testDivision() {
        assertEquals(2, calculator.divide(6, 3));
        assertEquals(Integer.MAX_VALUE, calculator.divide(Integer.MAX_VALUE, 1));
        assertEquals(Integer.MIN_VALUE, calculator.divide(Integer.MIN_VALUE, 1));
    }

    // Kiểm thử ngoại lệ chia cho 0
    @Test
    public void testDivisionByZero() {
        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> {
            calculator.divide(10, 0);
        });
        assertEquals("Không thể chia cho 0", exception.getMessage());
    }

    // Kiểm thử ngoại lệ tràn số khi chia
    @Test
    public void testDivisionOverflow() {
        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> {
            calculator.divide(Integer.MIN_VALUE, -1);
        });
        assertEquals("Tràn số khi chia", exception.getMessage());
    }

    // Kiểm thử các trường hợp với số âm
    @Test
    public void testNegativeNumbers() {
        assertEquals(-5, calculator.add(-2, -3));
        assertEquals(-1, calculator.subtract(-2, -1));
        assertEquals(6, calculator.multiply(-2, -3));
        assertEquals(-2, calculator.divide(-6, 3));
    }
}
