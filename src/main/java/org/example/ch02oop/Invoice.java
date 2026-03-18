/*
Fully implement the Invoice class in Section 2.7.1.
Provide a method that prints the invoice and a demo program that constructs and prints a sample invoice.
*/
package org.example.ch02oop;

import java.util.ArrayList;

public class Invoice {
    private static class Item { // Item is nested inside Invoice
        String description;
        int quantity;
        double unitPrice;

        double price() { return quantity * unitPrice; }
    }

    private final ArrayList<Item> items = new ArrayList<>();

    public void addItem(String description, int quantity, double unitPrice) {
        var newItem = new Item();
        newItem.description = description;
        newItem.quantity = quantity;
        newItem.unitPrice = unitPrice;
        items.add(newItem);
    }

    public void print() {
        for (Item item : items) {
            System.out.print("description: " + item.description + " | "  );
            System.out.print("quantity: " + item.quantity + " | "  );
            System.out.print("unitPrice: " + item.unitPrice + "\n"  );
        }
    }
}