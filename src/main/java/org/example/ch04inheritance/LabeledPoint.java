package org.example.ch04inheritance;

import java.util.Objects;

public class LabeledPoint extends Point {
    private String label;

    public LabeledPoint(String label, double x, double y) {
        super(x, y);
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return "LabeledPoint: "
                + "x: " + x
                + " | y: " + y
                + " | label: " + label;
    }

    @Override
    public boolean equals(Object otherObject){
        if(!super.equals(otherObject)) {
            return false;
        }
        var other = (LabeledPoint) otherObject;

        return label.equals(other.getLabel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), label);
    }
}
