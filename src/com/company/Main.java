package com.company;

public class Main {
    public static void main(String[] args) {

        Point p = new Point();
        System.out.print("begin: " + p);
        p.setX(3);
        p.setY(9);
        System.out.println("x = " + p.getX());
        System.out.println("y = " + p.getY());
        p.setXY(5, 10);
        System.out.println("x = " + p.getXY()[0]);
        System.out.println("y = " + p.getXY()[1]);
        System.out.println(p);

        Point point = new Point(27,36);
        System.out.print("point: " + point);

        Point another = new Point(59, 73);
        System.out.println("another: (" + another.getXY()[0] + ", " + another.getXY()[1] + ")\n");

        System.out.print("point: " + point);
        int x = 3, y = 4;
        System.out.println("anonym: (" + x + ", " + y + ")");
        System.out.printf("дистанция 1 = %.2f%n%n", point.distance(x, y));
        System.out.print("point: " + point);
        System.out.print("another: " + another);
        System.out.printf("дистанция 2 = %.2f%n%n", point.distance(another));
        System.out.print("point: " + point);
        System.out.println("begin: (0, 0)");
        System.out.printf("дистанция 3 = %.2f%n", point.distance());

    }
}
