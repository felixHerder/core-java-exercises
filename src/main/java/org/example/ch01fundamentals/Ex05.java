package org.example.ch01fundamentals;

/**
 * What happens when you cast a double to an int that is larger than the largest possible int value?
 */
public class Ex05 {
    public static void main(String[] args) {
        double d = Integer.MAX_VALUE + 76800000d;
        int i = (int) d;
        System.out.println(d);
        System.out.println(i);
    }
}
