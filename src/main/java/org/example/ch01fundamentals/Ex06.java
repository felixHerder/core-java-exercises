package org.example.ch01fundamentals;

import java.math.BigInteger;

/**
 * Write a program that computes the factorial n! = 1 × 2 × ... × n, using BigInteger. Compute the factorial of 1000.
 */
public class Ex06 {
    public static void main(String[] args) {
        System.out.println("Factorial of 1000 is: " + computeFactorial(1000));
    }

    static BigInteger computeFactorial(int n) {
        BigInteger factorial = BigInteger.valueOf(1);
        for (int i = 2; i <= n; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial;
    }
}
