package org.example.ch01fundamentals;

/**
 * Section 1.5.3 has an example of two strings s and t so that s.equals(t) but s != t.
 * Come up with a different example that doesn’t use substring.
 */
public class Ex09 {
    public static void main(String[] args) {
        String s = "Hell";
        String t = "Hell";
        System.out.println("s.equals(t) : " + s.equals(t));
        System.out.println("s!= t: " + (s != t));
    }


}
