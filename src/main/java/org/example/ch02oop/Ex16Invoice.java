package org.example.ch02oop;

public class Ex16Invoice {
    public static void main(String[] args) {
        Invoice invoice = new Invoice();
        invoice.addItem("16gb ddr4", 4, 234.34);
        invoice.addItem("750W power supply", 1, 311.23);
        invoice.print();
    }
}
