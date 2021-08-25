package com.company;

public class Triangle extends Shape {
    //===
    private double base;
    private double heigth;
    //===
    public Triangle() {
        super();
        this.base = 1;
        this.heigth = 1;
    }
    public Triangle(double base, double heigth) {
        super();
        this.base = base;
        this.heigth = heigth;
    }
    public Triangle(String color, double base, double heigth) {
        super(color);
        this.base = base;
        this.heigth = heigth;
    }
    //===
//    @Override
    public double getArea() {
        return base * heigth / 2;
    }
    @Override
    public String toString() {
        return "\nTriangle:\n" + super.toString() + "base = " + base +
                "\nheigth = " + heigth + "\narea = " + this.getArea();
    }
}