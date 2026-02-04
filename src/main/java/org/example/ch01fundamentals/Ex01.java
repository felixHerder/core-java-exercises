package org.example.ch01fundamentals;

import java.util.Scanner;

/** Write a program that reads an integer and prints it in binary, octal, and hexadecimal.
 * Print the reciprocal as a hexadecimal floating-point number.
*/
 public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input an integer: ");
        Integer input = scanner.nextInt();
        System.out.printf("%d as Binary: %s \n", input, Integer.toString(input,2));
        System.out.printf("%d as Octal: %o \n", input,input);
        System.out.printf("%d as Hex: %x \n", input, input);
        System.out.printf("Reciprocal 1/%d as Hex float: %a \n", input, 1.0/input);
    }
}
