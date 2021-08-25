package com.company;

public class Rectangle extends Shape {
    //===
    private double length;
    private double width;
    //===
    public Rectangle() {
        super();
        this.length = 1;
        this.width = 1;
    }
    public Rectangle(double length) {
        super();
        this.length = length;
        this.width = width;
    }
    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }
    //===
    public double getLength() {
        return this.length;
    }
    public double getWidth() {
        return this.width;
    }
    public double getPerimeter() {
        return 2 * (length + width);
    }
//    @Override
    public double getArea() {
        return length * width;
    }
    @Override
    public String toString() {
        return "\nRectangle:\n" + super.toString() + "length = " + length +
                "\nwidth = " + width + "\nperimeter = " + this.getPerimeter() +
                "\narea = " + this.getArea();
    }
    //===
    public void setLength(double length) {
        this.length = length;
    }
    public void setWidth(double width) {
        this.width = width;
    }
}
