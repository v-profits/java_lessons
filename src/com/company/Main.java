package com.company;

public class Main {
    public static void main(String[] args) {
        Circle с1 = new Circle();
        System.out.println(с1.toString()); // явный вызов метода toString()
        System.out.println(с1); //неявное обращение к с1.toString()
        System.out.println("Объект c1 это: " + с1); //'+' вызывает с1.toString(), чтобы получить строку до конкатенации

    }
}