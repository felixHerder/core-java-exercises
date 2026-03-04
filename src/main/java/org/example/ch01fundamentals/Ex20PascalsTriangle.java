package org.example.ch01fundamentals;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Write a program that stores Pascal’s triangle up to a given n in an ArrayList<ArrayList<Integer>>.
 */

public class Ex20PascalsTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input n:");
        int nthRow = scanner.nextInt();
        ArrayList<ArrayList<Integer>> triangle = new ArrayList<>();
        for (int i = 0; i < nthRow; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            row.add(1);
            for (int j = 1; j < i; j++) {
                int nextNum = triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j);
                row.add(nextNum);
            }
            if (i > 0) {
                row.add(1);
            }
            triangle.add(row);
        }
        for (ArrayList<Integer> r : triangle) {
            System.out.println(r);
        }
    }
}
