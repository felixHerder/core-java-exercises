/*
* Implement a class Queue, an unbounded queue of strings.
* Provide methods add, adding at the tail, and remove, removing at the head of the queue.
* Store elements as a linked list of nodes.
* Make Node a nested class. Should it be static or not?
* */
package org.example.ch02oop;

import java.util.LinkedList;

public class Ex17Queue {
    public static class Node {
        String value;

        public Node(String value) {
            this.value = value;
        }
    }

    public class Iterator {
        private int idx = 0;
        public Node next() {
            Node node = nodes.get(idx);
            idx++;
            return node;
        }

        public boolean hasNext() {
            return idx < nodes.size();
        }

    }

    public Iterator iterator() {
        return new Iterator();
    }

    LinkedList<Node> nodes = new LinkedList<>();

    public void add(Node node) {
        nodes.add(node);
    }

    public Node remove(Node node) {
        return nodes.remove();
    }
}
