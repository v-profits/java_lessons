package com.company;

public class Triangle extends Shape {
    private double base;
    private double heigth;

    public Triangle(String color, double base, double heigth) {
        super(color);
        this.base = base;
        this.heigth = heigth;
    }
    @Override
    public double getArea() { return base * heigth / 2; }
    @Override
    public String toString() {
        return "Triangle: \n" + super.toString() + "base = " + base +
                "\nheigth = " + heigth + "\narea = " + this.getArea() + "\n";
    }
}
