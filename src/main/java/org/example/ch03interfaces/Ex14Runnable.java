/*
 * Write a method that takes an array of Runnable instances and returns a Runnable whose run method executes them in order.
 * Return a lambda expression.
 * */
package org.example.ch03interfaces;

public class Ex14Runnable {
    public static void main(String[] args) {
        Runnable l1 = () -> System.out.println("output from lambda 1");
        Runnable l2 = () -> System.out.println("output from lambda 2");
        Runnable l3 = () -> System.out.println("output from lambda 3");
        Runnable[] lambdas = {l1, l2, l3};
        Runnable sequential = runSequential(lambdas);
        sequential.run();
    }

    static Runnable runSequential(Runnable[] lambdas) {
        return () -> {
            for (Runnable l : lambdas) {
                l.run();
            }
        };
    }
}
