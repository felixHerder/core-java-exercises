/*
 * Define a method Object add(Object first, Object second).
 * If the arguments are instances of Number, add the values. If they are instances of Boolean,
 * return Boolean.TRUE if either one is true. Otherwise, concatenate them as strings.
 * Use the instanceof operator with pattern matching.
 * */
package org.example.ch04inheritance;

public class Ex07PatternMatching {

    Object add(Object first, Object second) {
        return switch (first) {
            case Number firstNumber -> firstNumber.doubleValue() + ((Number) second).doubleValue();
            case Boolean __ -> (Boolean) first || (Boolean) second ? Boolean.TRUE : Boolean.FALSE;
            default -> (String) first + (String) second;
        };
    }
}
