/*
* Implement a class Greeter that implements Runnable and whose run method prints n copies of "Hello, " + target,
* where n and target are set in the constructor.
* Construct two instances with different messages and execute them concurrently in two threads.
* */
package org.example.ch03interfaces;

public class Ex09Greeter {
    public static void main(String[] args) {
        Greeter g1 = new Greeter(3,"Billy");
        Thread t1 = new Thread(g1);
        Greeter g2 = new Greeter(7, "Janie");
        Thread t2 = new Thread(g2);
        t1.start();
        t2.start();
    }
}
