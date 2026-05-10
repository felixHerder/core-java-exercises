package org.example.ch03interfaces;

public interface Person {
    String getName();
    default int getId() { return 0; }
}