package org.example.ch01fundamentals;

import java.util.Scanner;

/**
 * Write a program that reads an integer angle (which may be positive or negative)
 * and normalizes it to a value between 0 and 359 degrees.
 * Try it first with the % operator, then with floorMod.
 */
public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input an integer angle: ");
        Integer input = scanner.nextInt();
        int normalized1 = Math.abs(input) % 360;
        int normalized2 = Math.floorMod(Math.abs(input), 360);
        System.out.println("Normalized angle with %: " + normalized1);
        System.out.println("Normalized angle with floorMod: " + normalized2);
    }
}
