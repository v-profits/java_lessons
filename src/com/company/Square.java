package com.company;

public class Square extends Rectangle {
    //===
    public Square() { super(); }
    public Square(double side) { super(side, side); }
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }
    //===
    @Override
    public String toString() {
        return "\n\ncolor: " + super.getColor() + "\nfilled: " + super.isFilled() +
                "\nside: " + super.getLength();
    }
    @Override
    public double getArea() { return super.getArea(); }
    @Override
    public double getPerimeter() { return super.getPerimeter(); }
    public double getSide() { return super.getLength(); }
    //===
    public void setSide(double side) {
        super.setLength(side);
        super.setWidth(side);
    }
}
