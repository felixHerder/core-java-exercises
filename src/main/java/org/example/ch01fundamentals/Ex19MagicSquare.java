package org.example.ch01fundamentals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Write a program that reads a two-dimensional array of integers and determines whether it is
 * a magic square (that is, whether the sum of all rows, all columns, and the diagonals is the same).
 * Accept lines of input that you break up into individual integers, and stop when the user enters a blank line.
 * For example, with the input
 * 16 3 2 13
 * 5 10 11 8
 * 9 6 7 12
 * 4 15 14 1
 * (Blank line)
 * your program should respond affirmatively.
 */

public class Ex19MagicSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<List<Integer>> inputSquare = new ArrayList<>();

        System.out.println("Enter a line of numbers or a black line to stop:");
        String inputLine = scanner.nextLine();
        do {
            String[] splitLine = inputLine.split("\\s+");
            List<Integer> row = new ArrayList<>();
            inputSquare.add(row);
            for (String s : splitLine) {
                row.add(Integer.parseInt(s));
            }
            inputLine = scanner.nextLine();
        } while (!inputLine.isBlank());

        Integer sum = null;
        Boolean isMagicSquare = true;

        //check each row sum
        for (List<Integer> row : inputSquare) {
            Integer rowSum = row.stream().reduce(0, Integer::sum);
            if (sum != null && !rowSum.equals(sum)) {
                isMagicSquare = false;
                break;
            } else {
                sum = rowSum;
            }
        }

        //check each column
        for (int col = 0; col < inputSquare.getFirst().size() && isMagicSquare; col++) {
            Integer colSum = 0;
            for (List<Integer> rows : inputSquare) {
                colSum += rows.get(col);
            }
            if(!colSum.equals(sum)){
                isMagicSquare = false;
                break;
            }
        }
        //check right diagonal
        Integer rightDSum = 0;
        for (int row = 0; row < inputSquare.size() && isMagicSquare; row++) {
                rightDSum += inputSquare.get(row).get(row);
        }
        if(!rightDSum.equals(sum)) {
            isMagicSquare = false;
        }

        //check left diagonal
        Integer leftDSum = 0;
        for (int row = inputSquare.size() - 1; row >= 0 && isMagicSquare; row--) {
            int col = inputSquare.size() - 1 - row;
                leftDSum += inputSquare.get(row).get(col);
        }
        if(!leftDSum.equals(sum)) {
            isMagicSquare = false;
        }

        System.out.println("Input is " + (isMagicSquare ? "" : "not ") + "magic square!");
    }
}
