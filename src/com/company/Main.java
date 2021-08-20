package com.company;

public class Main {
    public static void main(String[] args) {

        Circle c1 = new Circle();
        System.out.println(c1.toString());
        System.out.printf("Площадь: %.2f%n", c1.getArea());

        Circle c2 = new Circle(1, 1, 3.0);
        System.out.println(c2.toString());
        System.out.printf("Площадь: %.2f%n", c2.getArea());
        System.out.printf("Дистанция: %.2f%n", c2.distance(c1));

        Circle c3 = new Circle(new Point(3, 4), 3.5);
        System.out.println(c3);
        System.out.printf("Площадь: %.2f%n", c3.getArea());
        System.out.println("Центр: " + c3.getCenter());
        System.out.printf("Окружность: %.2f%n", c3.getCircumference());
        System.out.printf("Дистанция: %.2f%n", c3.distance(c1));

    }
}