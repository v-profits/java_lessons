package com.company;

import static java.lang.String.format;

public class Book {
    private String author;
    private String name;
    private double price;
    private int quantity;

    Book(String author, String name, double price, int quantity) {
        this.author = author;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    Book(String author, String name) {
        this.author = author;
        this.name = name;
        this.price = 0.0;
        this.quantity = 0;
    }

    public void setPrice(double price) {
        this.price = price;
        System.out.println("Change price book: " + price);
        System.out.println();
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
        System.out.println("Change quantity books: " + quantity);
        System.out.println();
    }

    public String getAuthor() {
        return this.author;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public String toString() {
        //return format("Book: %s \nAuthor: %s \nName: %s \nPrice: %0.2f \nQuantity: %d", author, name, price, quantity);
        return "Book:\nAuthor: " + author + "\nName: " + name + "\nPrice: " + price + "\nQuantity: " + quantity + "\n";
    }

    public void addBook(int add) {
        quantity += add;
        System.out.println("Add book: " + add);
        System.out.println();
    }
}
