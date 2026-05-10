/*
* The SquareSequence class doesn’t actually deliver an infinite sequence of squares due to integer overflow.
* Specifically, how does it behave?
* Fix the problem by defining a Sequence<T> interface and a SquareSequence class that implements Sequence<BigInteger>.
* */
package org.example.ch03interfaces;

public class Ex06SquareSequence {
    public static void main(String[] args) {
        SquareSequence seq = new SquareSequence();
        for (int i = 0; i < 4; i++) {
            System.out.println(seq.next());
        }
    }
}
