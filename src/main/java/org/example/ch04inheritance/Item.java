package org.example.ch04inheritance;

import java.util.Objects;

public class Item {
    private String description;
    private double price;
        
    public Item(String description, double price) {
        this.description = description;
        this.price = price;
    }

    public boolean equals(Object otherObject) {
        if (otherObject instanceof Item other) {
            return Objects.equals(description, other.description)
                    && price == other.price;
        }
        return false;
    }
    
    public int hashCode() {
        return Objects.hash(description, price);
    }
}
