package com.company;

public class Circle extends Shape {
    //===
    protected double radius;
    //===
    public Circle() { super(); radius = 1.0; }
    public Circle(double radius) { super(); this.radius = radius; }
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }
    //===
    public double getRadius() { return this.radius; }
    @Override
    public String toString() { return "\n" + super.toString() + "\nрадиус: " + radius; }
    @Override
    public double getArea() { return Math.pow(radius, 2) * Math.PI; }
    @Override
    public double getPerimeter() { return 2 * Math.PI * radius; }
    //===
    public void setRadius(double radius) { this.radius = radius; }
}