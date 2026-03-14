package org.example.ch02oop;
/*
 * In the RandomNumbers class, provide two static methods randomElement that get a random element from an array or array list of integers.
 * (Return zero if the array or array list is empty.)
 * Why couldn’t you make these methods into instance methods of int[] or ArrayList<Integer>?
 * */

import java.util.ArrayList;
import java.util.random.RandomGenerator;

public class Ex11RandomNumbers {
    private static final RandomGenerator generator = RandomGenerator.getDefault();

    public static int nextInt(int low, int high) {
        return low + generator.nextInt(high - low + 1);
        // Ok to access the static generator variable
    }

    public static int radomElement (int[] array) {
        if (array.length == 0) {
            return 0;
        }
        int randIdx = generator.nextInt(array.length);
        return array[randIdx];
    }

    public static int radomElement (ArrayList<Integer> array) {
        if (array.isEmpty()) {
            return 0;
        }
        int randIdx = generator.nextInt(array.size());
        return array.get(randIdx);
    }

}
