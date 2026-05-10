/*
* Implement methods
        public static void runTogether(Runnable... tasks)
        public static void runInOrder(Runnable... tasks)
* The first method should run each task in a separate thread and then return.
* The second method should run all methods in the current thread and return when the last one has completed.
* */
package org.example.ch03interfaces;

public class Ex10RunTogether {

    public static void runTogether(Runnable... tasks) {
        for (Runnable t : tasks) {
            Thread.ofPlatform().start(t);
        }
    }

    public static void runInOrder(Runnable... tasks) {
        for (Runnable t : tasks) {
            t.run();
        }
    }
}
