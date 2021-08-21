package com.company;

public class Main {
    public static void main(String[] args) {

        //=== глава 2, задание 4
        Line line = new Line(new Point(2, 4), new Point(34, 145));
        System.out.println(line);
        System.out.printf("Угол наклона к оси X: %.2f градусов\n", line.getGradient());

        //=== глава 2, задание 5
        System.out.printf("Расстояние: %.2f%n", line.distance(16, 38));
        Point point = new Point(16, 38);
        System.out.printf("Расстояние: %.2f%n", line.distance(point));
    }
}