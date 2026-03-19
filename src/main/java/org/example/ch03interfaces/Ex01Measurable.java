/*
* Provide an interface Measurable with a method double getMeasure() that measures an object in some way.
* Make Employee implement Measurable.
* Provide a method double average(Measurable[] objects) that computes the average measure.
* Use it to compute the average salary of an array of employees.
* */
package org.example.ch03interfaces;

public class Ex01Measurable {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new Employee("Bob", 2345.99);
        employees[1] = new Employee("Jim", 6545.99);
        employees[2] = new Employee("Alice", 12545.93);

        double averageSalary = average(employees);
        System.out.println(averageSalary);
        double largestSalary = ((Employee) largest(employees)).getSalary();
        System.out.println(largestSalary);
    }

    static double average(Measurable[] objects) {
        double total = 0;
        for(Measurable obj : objects) {
            total += obj.getMeasure();
        }

        return  total / objects.length;
    }

    static Measurable largest(Measurable[] objects) {
        if(objects == null || objects.length == 0) {
            return null;
        }
        Measurable largestMeasurable = objects[0];
        for(Measurable obj : objects) {
            if(largestMeasurable.getMeasure() < obj.getMeasure()) {
                largestMeasurable = obj;
            }
        }

        return largestMeasurable;
    }
}
