package org.example.ch01fundamentals;

import java.util.Scanner;
/**
 * Write a program that reads a line of text and prints all characters that are not ASCII, together with their Unicode values.
 */
public class Ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input string with unicode values");
        String inputS = scanner.nextLine();
        String[] grapheneClusters = inputS.split("\\b{g}");
        System.out.println("Non ASCII characters:");
        for (String s : grapheneClusters) {
            if (s.length() > 1 && Character.hashCode(s.charAt(0)) > 127) {
                System.out.println(s);
            }
        }
    }


}
