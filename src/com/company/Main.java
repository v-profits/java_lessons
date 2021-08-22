package com.company;

public class Main {
    public static void main(String[] args){

        Point3D p1 = new Point3D();
        System.out.println(p1);

        Point3D p2 = new Point3D(2, 3, 4);
        System.out.println(p2);

        Point3D p3 = new Point3D(new Point(4,5), 6);
        System.out.println(p3);

    }
}

