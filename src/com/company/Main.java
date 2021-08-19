package com.company;

public class Main {
    public static void main(String[] args) {

        Author Ivanov = new Author("Ivanov","ivan@mail.ru");
        System.out.println(Ivanov);

        Book bookNext1 = new Book(Ivanov, "Istory Java", 1.55, 2000);
        System.out.println(bookNext1);
        bookNext1.setPrice(1.60);
        bookNext1.setQuantity(1800);
        bookNext1.addBooks(300);
        System.out.println("Название: " + bookNext1.getName());
        System.out.println("Цена: " + bookNext1.getPrice());
        System.out.println("Количество: " + bookNext1.getQuantity());
        System.out.println("Автор: " /*+ bookNext1.getAuthor()*/);
        System.out.println("имя автора: " + bookNext1.getAuthor().getName());
        System.out.println("email автора: " + bookNext1.getAuthor().getEmail());
        System.out.println();

        Book bookNext2 = new Book(new Author("Petrov","piter@mail.ru"), "Java для профи", 3.05, 3900);
        System.out.println(bookNext2);

    }
}