package org.example.ch01fundamentals;

import java.util.Scanner;

/**
 * Using only the conditional operator, write a program that reads three integers and prints the largest. Repeat with Math.max.
 */
public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input 3 integers: ");
        int inputA = scanner.nextInt();
        int inputB = scanner.nextInt();
        int inputC = scanner.nextInt();
        int largestCond = (inputA > inputB && inputA > inputC) ? inputA : (inputB > inputA && inputB > inputC) ? inputB : inputC;
        int largestMath = Math.max(Math.max(inputA, inputB), inputC);
        System.out.println("Largest with conditional is: " + largestCond);
        System.out.println("Largest with Math is: " + largestMath);
    }
}
