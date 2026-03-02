package org.example.ch01fundamentals;

import java.util.Random;

/**
 * Write a program that produces a random string of letters and digits by generating a random long value and printing it in base 36.
 */
public class Ex10 {
    public static void main(String[] args) {
        Random rand = new Random();
        long randL = rand.nextLong();
        String b36 = Long.toString(randL, 36);
        System.out.println("base 36 for:"  + randL + " = " + b36);
    }


}
