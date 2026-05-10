/*
* Write a call to Arrays.sort that sorts employees by salary, breaking ties by name.
* Use Comparator.thenComparing. Then do this in reverse order.
* */
package org.example.ch03interfaces;

import java.util.Arrays;
import static java.util.Comparator.*;

public class Ex15SortEmployees {
    public static void main(String[] args) {
        Employee[] employees = new Employee[4];
        employees[0] = new Employee("Jim", 6545.99);
        employees[1] = new Employee("Bob", 2345.99);
        employees[2] = new Employee("Alice", 12545.93);
        employees[3] = new Employee("Jane", 12545.93);


        Arrays.sort(employees,comparing(Employee::getSalary).reversed().thenComparing(Employee::getName));
        System.out.println(Arrays.toString(employees));

    }
}
