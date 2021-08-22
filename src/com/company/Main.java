package com.company;

public class Main {
    public static void main(String[] args){

        System.out.println(new Cylinder());
        System.out.println(new Cylinder(3, 2, 5, 2.5));
        Cylinder cylinder = new Cylinder(new Point(5, 7), 2.5, 4);
        System.out.println(cylinder);

        System.out.println("====================================\n\nX = " + cylinder.getCenterX() +
                "\nY = " + cylinder.getCenterY() + "\nRadius = " + cylinder.getRadius() +
                "\nHeigth = " + cylinder.getHeigth() + "\nArea = " + cylinder.getArea() +
                "\nValume = " + cylinder.getValume());

    }
}

