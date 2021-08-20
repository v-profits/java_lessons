package com.company;

public class Main {
    public static void main(String[] args) {

        Line l = new Line(3, 4, 8, 9);
        System.out.println(l.toString());
        System.out.printf("Length: %.2f%n", l.getLength());

    }
}