package org.example.ch01fundamentals;

import java.util.Scanner;

/**
 * Write a switch statement that, when given a string with a compass direction "N", "S", "E", or "W",
 * adjusts the variables x and y. For example, "W" should decrement x by 1.
 */
public class Ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a compass direction");
        String inputS = scanner.nextLine();
        int x = 0;
        int y = 0;

        while (true) {
            switch (inputS) {
                case "N" -> y += 1;
                case "E" -> x += 1;
                case "S" -> y -= 1;
                case "W" -> x -= 1;
            }
            System.out.println("New coordinates x:" + x + " -- y:" + y);
            System.out.println("Enter a compass direction");
            inputS = scanner.nextLine();
        }


    }

}
