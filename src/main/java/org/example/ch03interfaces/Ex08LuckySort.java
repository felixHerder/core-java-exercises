/*
 * Implement the method void luckySort(ArrayList<String> strings, Comparator<String> comp) that keeps calling
 * Collections.shuffle on the array list until the elements are in increasing order, as determined by the comparator.
 * */
package org.example.ch03interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class Ex08LuckySort {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>(List.of("g", "b", "c", "s"));

        Comparator<String> comp = String::compareTo;
        luckySort(strings,comp);
        System.out.println(strings);
    }

    static void luckySort(ArrayList<String> strings, Comparator<String> comp) {
        boolean isSorded = false;

        while (!isSorded) {
            Collections.shuffle(strings);
            System.out.println(strings);
            isSorded = true;
            for (int i = 0; i < strings.size() - 1; i++) {
                if (comp.compare(strings.get(i), strings.get(i + 1)) > 0) {
                    isSorded = false;
                    break;
                }
            }
        }
    }
}
