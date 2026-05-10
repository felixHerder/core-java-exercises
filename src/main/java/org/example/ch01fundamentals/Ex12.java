package org.example.ch01fundamentals;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Write a switch expression that, when given a string with a compass direction "N", "S", "E", or "W",
 * yields an array of x- and y-offsets. For example, "W" should yield new int[] { -1, 0 }.
 */
public class Ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a compass direction");
        String inputS = scanner.nextLine();

        int[] output = switch (inputS) {
            case "N" -> new int[]{0, 1};
            case "E" -> new int[]{1, 0};
            case "S" -> new int[]{0, -1};
            case "W" -> new int[]{-1, 0};
            default -> new int[]{0, 0};
        };
        System.out.println("Compass coordinates: " + Arrays.toString(output));
    }

}
