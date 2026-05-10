package org.example.ch02oop;

import org.omg.CORBA.IntHolder;

/**
 * Why can’t you implement a Java method that swaps the contents of two int variables?
 * Instead, write a method that swaps the contents of two IntHolder objects. (
 * Look up this rather obscure class in the API documentation.) Can you swap the contents of two Integer objects?
 */

public class Ex04IntSwap {
    public static void main(String[] args) {
        IntHolder a = new IntHolder(10);
        IntHolder b = new IntHolder(20);
        swap(a,b);
        System.out.println(a.value);
        System.out.println(b.value);
    }

    static void swap(IntHolder a, IntHolder b) {
        if(a == null || b == null) return;

        int temp = a.value;
        a.value = b.value;
        b.value = temp;
    }
}
