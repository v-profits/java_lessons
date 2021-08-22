package com.company;

public class Main {
    public static void main(String[] args){
        Cylinder c = new Cylinder();
        System.out.println(c);
        System.out.println(new Cylinder(2.5));
        System.out.println(new Cylinder(2.5, 4));
    }
}
