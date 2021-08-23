package com.company;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }
    @Override
    public double getArea() { return length * width; }
    @Override
    public String toString() {
        return "Rectangel: \n" + super.toString() + "length = " + length +
                "\nwidth = " + width + "\narea = " + this.getArea() + "\n";
    }
}
