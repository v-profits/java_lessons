package com.company;

public class Main {
    public static void main(String[] args) {

        Line line = new Line(new Point(2, 4), new Point(34, 145));
        System.out.println(line);
        System.out.printf("Угол наклона к оси X: %.2f градусов\n", line.getGradient());

    }
}