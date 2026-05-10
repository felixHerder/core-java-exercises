package org.example.ch02oop;

/**
 * Represents a time within a 24-hour cycle.
 * @param hour The hour of the day (0-24).
 * @param minutes The minutes past the hour (0-60).
 * */
public record TimeOfDay(int hour, int minutes) {
    /**
     * Canonical constructor that normalizes overflow.
     * @param hour Initial hours.
     * @param minutes Initial minutes; overflows increment the hour.
     * */
    public TimeOfDay(int hour, int minutes) {
        this.hour = (hour + (minutes / 60)) % 24;
        this.minutes = minutes % 60;
    }

    /**
     * Creates a new instance incremented by the supplied minutes.
     * @param minutes The number of minutes to add.
     * @return A new normalized TimeOfDay instance.
     * */
    public TimeOfDay plusMinutes(int minutes) {
        int newMinutes = (this.minutes + minutes);
        return new TimeOfDay(this.hour, newMinutes);
    }

    /**
     * Computes total minutes from this and another TimeOfDay.
     * @param other The TimeOfDay to compare against.
     * @return The difference in minutes.
     * */
    public int minutesFrom(TimeOfDay other) {
        TimeOfDay difference = new TimeOfDay(other.hour - this.hour ,  other.minutes - this.minutes);
        return difference.minutes + difference.hour * 60;
    }
}
