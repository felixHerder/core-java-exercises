/*
* Define a class Point with a constructor public Point(double x, double y) and accessor methods getX, getY.
*
* Define a subclass LabeledPoint with a constructor public LabeledPoint(String label, double x, double y) and an accessor method getLabel.
* Define toString, equals, and hashCode methods for the classes of the preceding exercise.
*
* Make the instance variables x and y of the Point class in Exercise 2 protected.
* Show that the LabeledPoint class can access these variables only in LabeledPoint instances.
*
* Define an abstract class Shape with an instance variable of class Point, a constructor,
* a concrete method public void moveBy(double dx, double dy) that moves the point by the given amount,
* and an abstract method public Point getCenter().
* Provide concrete subclasses Circle, Rectangle, Line with constructors public Circle(Point center, double radius),
* public Rectangle(Point topLeft, double width, double height), and public Line(Point from, Point to).

* Define clone methods for the classes of the preceding exercise.
* */
package org.example.ch04inheritance;

public class Ex01Point {

    public Ex01Point() {
    }

    public static void main(String[] args) {
        Point p1 = new Point(2, 3);
        Point p2;
        LabeledPoint lp1 = new LabeledPoint("p1", 2, 3);
        LabeledPoint lp2;

        try {
            lp2 = (LabeledPoint) lp1.clone();
            p2 = p1.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(lp1);
        System.out.println(lp2);
    }
}
