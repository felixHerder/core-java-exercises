package org.example.ch01fundamentals;

import java.util.Scanner;

/**
 * Write a program that reads a string and prints all of its nonempty substrings.
 */
public class Ex08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a string:");
        String input = scanner.nextLine();
        System.out.println("Generated substrings:");
        for (String subs : input.split(" ")) {
            System.out.println(subs);
        }

    }


}
