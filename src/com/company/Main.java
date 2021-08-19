package com.company;
//тест

public class Main {
    public static void main(String[] args) {

        Book book = new Book("Ivanov", "Istory", 1.55, 2000);
        System.out.println(book.toString());
        book.setPrice(1.60);
        book.setQuantity(1800);
        System.out.println(book);
        book.addBook(300);
        System.out.println(book);

    }
}