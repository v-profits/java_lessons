package com.company;

public class Rectangle extends Shape_2 {
    private double length;
    private double width;
    //===
    public Rectangle() {
        super();
        this.length = 1;
        this.width = 1;
    }
    public Rectangle(double length, double width) {
        super();
        this.length = length;
        this.width = width;
    }
    public Rectangle(double length, double width, String color, boolean filled) {
        super(color, filled);
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
    //@Override
    public double getPerimeter() {
        return 2 * (length + width);
    }
    @Override
    public double getArea() {
        return length * width;
    }
    @Override
    public String toString() {
        return "" + super.toString() + "length = " + length +
                "\nwidth = " + width + "\nperimeter = " + this.getPerimeter() +
                "\narea = " + this.getArea() + "\n";
    }
    //===
    public void setLength(double length) {
        this.length = length;
    }
    public void setWidth(double width) {
        this.width = width;
    }
}
