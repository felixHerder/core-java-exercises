/*
* Rewrite the Cal class to use static imports for the System and LocalDate classes.
* */

package org.example.ch02oop;

import java.time.DayOfWeek;
import java.time.LocalDate;

import static java.time.LocalDate.*;
import static java.lang.System.*;

public class Ex12CalStaticImports {

        public static void main(String[] args) {
            LocalDate date = now().withDayOfMonth(1);
            int month;
            if (args.length >= 2) {
                month = Integer.parseInt(args[0]);
                int year = Integer.parseInt(args[1]);
                date = of(year, month, 1);
            } else {
                month = date.getMonthValue();
            }

            out.println(" Mon Tue Wed Thu Fri Sat Sun");
            DayOfWeek weekday = date.getDayOfWeek();
            int value = weekday.getValue(); // 1 = Monday, ... 7 = Sunday
            for (int i = 1; i < value; i++)
                out.print("    ");
            while (date.getMonthValue() == month) {
                out.printf("%4d", date.getDayOfMonth());
                date = date.plusDays(1);
                if (date.getDayOfWeek().getValue() == 1)
                    out.println();
            }
            if (date.getDayOfWeek().getValue() != 1)
                out.println();
        }
    }

