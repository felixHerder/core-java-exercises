package org.example.ch01fundamentals;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * Write a program that prints a lottery combination, picking six distinct numbers between 1 and 49.
 * To pick six distinct numbers, start with an array list filled with 1...49.
 * Pick a random index and remove the element. Repeat six times. Print the result in sorted order.
 */
public class Ex18Lottery {
    public static void main(String[] args) {
        List<Integer> numberSequence = new ArrayList<>(IntStream.range(1, 50).boxed().toList());
        Random randGen = new Random();
        List<Integer> drawnNumbers = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            int randIndex = randGen.nextInt(1, numberSequence.toArray().length);
            drawnNumbers.add(numberSequence.get(randIndex));
            numberSequence.remove(randIndex);
        }
        drawnNumbers.sort((a,b) ->  a - b);
        System.out.println(drawnNumbers);
    }
}
