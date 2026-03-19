package org.example.ch03interfaces;

public interface Sequence<T> {
    default boolean hasNext() {
        return true;
    }

    T next();
}
