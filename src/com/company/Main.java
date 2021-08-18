package com.company;

public class Main {
    public static void main(String[] args) {

        Circle c1 = new Circle();
        System.out.println(c1.toString()); // явный вызов метода toString()
        System.out.println(c1); //неявное обращение к c1.toString()
        System.out.println("Объект c1 это: " + c1); //'+' вызывает c1.toString(), чтобы получить строку до конкатенации

        //выполнение задание 1, глава 1
        System.out.println("Радиус с1: " + c1.getRadius());
        System.out.println("Цвет с1: " + c1.getColor());
        System.out.println("Площадь c1: " + c1.getArea());
        System.out.println(c1);

    }
}