package org.example.ch02oop;
/**
 * Implement a record TimeOfDay with hour and minute components.
 * Normalize them so that the hour is between 0 and 23 and the minute between 0 and 59.
 * Provide a method TimeOfDay plusMinutes(int minutes) that yields a new TimeOfDay object,
 * the given number of minutes away, and a method int minutesFrom(TimeOfDay other)
 * that yields the minutes between this and the given TimeOfDay instance.
 */

public class Ex09TimeOfDay {
    public static void main(String[] args) {
        TimeOfDay t1 = new TimeOfDay(17,30);
        System.out.println(t1);
        System.out.println(t1.plusMinutes(180));
        System.out.println(t1.minutesFrom(new TimeOfDay(19,45)));
        System.out.println(t1.minutesFrom(new TimeOfDay(11,15)));

    }
}
