package com.company;

public class Main {
    public static void main(String[] args) {

        Shape s1 = new Shape("черный");
        System.out.println("Shape.getArea: " + s1.getArea());
        System.out.println(s1);

        System.out.println(new Shape("red"));

        Shape s2 = new Triangle("blue", 4.5, 2.9);
        System.out.println(s2);
        Shape s3 = new Rectangle("green", 4.5, 2.9);
        System.out.println(s3);

        Shape s4 = new Triangle("blue", 4.5, 2.9);
        System.out.println(s4);
        Shape s5 = new Rectangle("green", 4.5, 2.9);
        System.out.println(s5);

//        Shape s3 = new Shape("green");
//        System.out.println(s3);
//        System.out.println("Area is " + s3.getArea());

    }
}