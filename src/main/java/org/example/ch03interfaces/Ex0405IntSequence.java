/*
 * Implement a static of method of the IntSequence class that yields a sequence with the arguments.
 * For example, IntSequence.of(3, 1, 4, 1, 5, 9) yields a sequence with six values.
 * Extra credit if you return an instance of an anonymous inner class.
 * */

/*
* Add a static method with the name constant of the IntSequence class that yields an infinite constant sequence.
* For example, IntSequence.constant(1) yields values 1 1 1..., ad infinitum.
* Extra credit if you do this with a lambda expression.
* */
package org.example.ch03interfaces;

public class Ex0405IntSequence {
    public static void main(String[] args) {
        IntSequence seq = IntSequence.of(4, 35, 12, 45, 67);
        while (seq.hasNext()) {
            System.out.println(seq.next());
        }

        IntSequence constant = IntSequence.constant(42);
        for (int i = 0; i < 5; i++) {
            System.out.println(constant.next());
        }
    }
}
