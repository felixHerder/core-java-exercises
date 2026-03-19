package org.example.ch03interfaces;

public interface IntSequence {

    default boolean hasNext() {
        return true;
    }

    int next();

    public static IntSequence of(int... args) {
        return new IntSequence() {
            int idx = 0;

            @Override
            public boolean hasNext() {
                return idx < args.length;
            }

            @Override
            public int next() {
                return args[idx++];
            }
        };
    }

    public static IntSequence constant(int i) {
        return () -> i;
    }
}