/*
* Suppose that in Section 4.3.2, the Item.equals method uses an instanceof test.
* Implement DiscountedItem.equals so that it compares only the superclass if otherObject is an Item,
* but also includes the discount if it is a DiscountedItem. Show that this method preserves symmetry
* but fails to be transitive—that is, find a combination of items and discounted items so that x.equals(y) and y.equals(z), but not x.equals(z).
* */
package org.example.ch04inheritance;

public class Ex06InstanceOfEquals {
    public static void main(String[] args) {
        Item peelerX = new Item("a peeler", 23.3);
        DiscountedItem peelerDiscountedY = new DiscountedItem("a peeler", 23.3,4.4);
        DiscountedItem peelerDiscountedZ = new DiscountedItem("a peeler", 23.3,4.4);

        System.out.println("x.equals(y):");
        System.out.println(peelerX.equals(peelerDiscountedY));
        System.out.println("y.equals(z):");
        System.out.println(peelerDiscountedY.equals(peelerDiscountedZ));
        System.out.println("not z.equals(x):");
        System.out.println(peelerDiscountedZ.equals(peelerX));

    }
}
