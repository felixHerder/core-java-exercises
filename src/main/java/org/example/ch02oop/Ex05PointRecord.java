package org.example.ch02oop;

/**
 * Add methods translate and scale to the Point record.
 * The translation method moves the point by a given amount in x- and y-direction.
 * The scale method scales both coordinates by a given factor.
 * Implement these methods so that they return new points with the results. For example,
 *   Point p = new Point(3, 4).translate(1, 3).scale(0.5);
 * should set p to a point with coordinates (2, 3.5).
 */

public class Ex05PointRecord {
    public static void main(String[] args) {
        PointRecord p = new PointRecord(24.2,434.4);
        System.out.println(p.translate(233,1111).scale(10));
    }
}
