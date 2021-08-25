package com.company;

public class Square extends Rectangle { //
    public Square() {
        super();
    }
    public Square(double side) {
        super(side, side);
    }
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }
    //===
    public double getSide() {
        return super.getLength();
    }
    @Override
    public String toString() {
        return "color = " + this.getColor() + "\nfilled = " + this.isFilled() +
                "\nside = " + this.getLength() + "\nperimeter = " + this.getPerimeter() +
                "\narea = " + this.getArea() + "\n";
    }
    //===
    public void setLingth(double side) {
        super.setLength(side);
    }
    public void setWidth(double side) {
        super.setWidth(side);
    }
}
