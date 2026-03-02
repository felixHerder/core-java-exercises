package org.example.ch01fundamentals;

import java.util.Scanner;

/**
 * Write a program that reads in two integers between 0 and 4294967295, stores them in int variables,
 * and computes and displays their unsigned sum, difference, product, quotient, and remainder.
 * Do not convert them to long values.
 */
public class Ex07 {
    public static void main(String[] args) {
        System.out.println("Input two integers between 0 and 429467295:");
        Scanner scanner = new Scanner(System.in);
        int input1 = scanner.nextInt();
        int input2 = scanner.nextInt();
        System.out.println("Sum: " + (input1 + input2));
        System.out.println("Difference: " + (input1 - input2));
        System.out.println("Product: " + (input1 * input2));
        System.out.println("Quotient: " + (input1 / input2));
        System.out.println("Remainder: " + (input1 % input2));

    }
}