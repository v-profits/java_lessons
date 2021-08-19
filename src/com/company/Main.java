package com.company;

public class Main {
    public static void main(String[] args) {

        Author ivanov = new Author("Иванов", "ivan@mail.ru");
        System.out.println(ivanov);

        ivanov.setEmail("ivanov@gmail.com");
        System.out.println(ivanov);
        System.out.println("имя: " + ivanov.getName());
        System.out.println("email: " + ivanov.getEmail());

    }
}