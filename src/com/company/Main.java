package com.company;

public class Main {
    public static void main(String[] args){
        Cylinder_1 cylinder = new Cylinder_1();
        System.out.println(cylinder);
        System.out.println(new Cylinder_1(2.5));
        System.out.println(new Cylinder_1(2.5, 4));

        Circle_1 circle = new Circle_1();
        System.out.println(circle);
    }
}
