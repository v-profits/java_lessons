package com.company;

public class Rectangle extends Shape {
    //===
    protected double length;
    protected double width;
    //===
    public Rectangle() {
        super();
        this.length = 1;
        this.width = 1;
    }
    public Rectangle(double width, double length) {
        super();
        this.length = length;
        this.width = width;
    }
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.length = length;
        this.width = width;
    }
    //===
    @Override
    public String toString() {
        return "\n" + super.toString() + "\nwidth: " + width + "\nlength: " + length;
    }
    @Override
    public double getArea() {
        return width * length;
    }
    @Override
    public double getPerimeter() {
        return (width + length) * 2;
    }
    public double getWidth() { return this.width; }
    public double getLength() { return this.length; }
    //===
    public void setWidth(double width) { this.width = width; }
    public void setLength(double length) {
        this.length = length;
    }
}
