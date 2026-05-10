package org.example.ch03interfaces;

import java.math.BigInteger;

public class SquareSequence implements Sequence<BigInteger> {
    private BigInteger i = BigInteger.ZERO;

    public BigInteger next() {
        i = i.add(BigInteger.ONE);
        return i.pow(2);
    }
}