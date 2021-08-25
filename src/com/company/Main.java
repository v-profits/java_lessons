package com.company;

public class Main {
    public static void main(String[] args) {

        Shape c = new Circle(3, "blue", true);
        Shape r = new Rectangle(4, 5, "green", false);
        Shape s = new Square(2, "black", true);

        System.out.println(c + "" + r + s);

    }
}