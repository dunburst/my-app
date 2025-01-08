package com.example;
public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Không thể chia cho 0");
        }
        if (a == Integer.MIN_VALUE && b == -1) {
            throw new ArithmeticException("Tràn số khi chia");
        }
        return a / b;
    }
}

