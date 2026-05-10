package org.example.ch03interfaces;

public interface Identified {
    default int getId() { return Math.abs(hashCode()); } 
}