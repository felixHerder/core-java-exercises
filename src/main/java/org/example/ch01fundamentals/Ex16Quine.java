package org.example.ch01fundamentals;

/**
 * Write a switch statement that, when given a string with a compass direction "N", "S", "E", or "W",
 * adjusts the variables x and y. For example, "W" should decrement x by 1.
 */
public class Ex16Quine {
    public static void main(String[] args) {
        String output = """
            public class Ex16 {
                public static void main(String[] args) {
                    String output = \"""
                    \"""
                    String[] splitArray = output.split("\\n");
                    for (int i = 0; i < 4; i++) {
                        System.out.println(splitArray[i]);
                    }
                    for (int i = 0; i < splitArray.length; i++) {
                        String leadingSpace = "            ";
                        System.out.println(splitArray[i]);
                    }
                    for (int i = 5; i < splitArray.length; i++) {
                        System.out.println(splitArray[i]);
                    }
                }
            """;
        String[] splitArray = output.split("\n");
        for (int i = 0; i < 3; i++) {
            System.out.println(splitArray[i]);
        }
        for (int i = 0; i < splitArray.length; i++) {
            String leadingSpace = "            ";
            System.out.println(leadingSpace + splitArray[i]);
        }
        for (int i = 4; i < splitArray.length; i++) {
            System.out.println(splitArray[i]);
        }
    }

}
