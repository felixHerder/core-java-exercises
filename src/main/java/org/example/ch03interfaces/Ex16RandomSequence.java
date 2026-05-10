/*
 * Implement the RandomSequence in Section 3.9.1 as a nested class, outside the randomInts method.
 * */

package org.example.ch03interfaces;

import java.util.random.RandomGenerator;

class Ex16RandomSequence {
    private RandomGenerator generator = RandomGenerator.getDefault();

    class RandomSequence implements IntSequence {
        private final int low;
        private final int high;

        public RandomSequence(int low, int high) {
            this.low = low;
            this.high = high;
        }

        public int next() {
            return low + generator.nextInt(high - low + 1);
        }

        public boolean hasNext() {
            return true;
        }
    }

    public IntSequence randomInts(int low, int high) {
        return new RandomSequence(low, high);
    }

}


