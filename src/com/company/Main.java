package com.company;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println(c1.toString()); // явный вызов метода toString()
        System.out.println(c1); //неявное обращение к cl.toString()
        System.out.println("Объект c1 это: " + c1); //'+' вызывает cl.toString(), чтобы получить строку до конкатенации

        Circle c2 = new Circle(2);
        System.out.println(c2);
    }
}