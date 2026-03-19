package org.example.ch03interfaces;

import java.util.Iterator;

public class DigitSequence implements Iterator<Integer> {
    private Integer number;

    public DigitSequence(Integer n) {
        number = Math.abs(n);
    }

    public boolean hasNext() {
        return number != 0;
    }

    public Integer next() {
        Integer result = number % 10;
        number /= 10;
        return result;
    }
    
    public void remove() {

    }
}
