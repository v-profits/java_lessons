package com.company;

public class Book {
    private final String name;
    private final Author author;
    private double price;
    private int quantity;

    Book(Author author, String name, double price, int quantity) {
        this.author = author;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    Book(Author author, String name) {
        this.author = author;
        this.name = name;
        this.price = 0.0;
        this.quantity = 0;
    }

    //==================================
    public String getName() {
        return this.name;
    }

    public Author getAuthor() {
        return this.author;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
//        System.out.println("Change price book: " + price);
//        System.out.println();
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
//        System.out.println("Change quantity books: " + quantity);
//        System.out.println();
    }

    //=================================
    public String toString() {
        //return format("Book: %s \nAuthor: %s \nName: %s \nPrice: %0.2f \nQuantity: %d", author, name, price, quantity);
        return "Автор: " + author + "Книга:\nназвание книги: " + name +
                "\nцена: " + price + "$\nколичество: " + quantity + "\n";
    }

    //====================================
    public void addBooks(int add) {
        quantity += add;
//        System.out.println("Add book: " + add);
//        System.out.println();
    }
}
