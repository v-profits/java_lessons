package com.company;

public class Circle_2 extends Shape_2{
    private double radius;
    //===
    public Circle_2() {
        super();
        radius = 1;
    }
    public Circle_2(double radius) {
        super();
        this.radius = radius;
    }
    public Circle_2(double radius, String color, boolean filled) { //
        super(color, filled);
        this.radius = radius;
    }
    //===
    public double getRadius() {
        return this.radius;
    }
    @Override
    public double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    @Override
    public String toString(){
        return super.toString() + "radius = " + radius +
                "\nperimeter = " + this.getPerimeter() + "\narea = " + this.getArea() + "\n";
    }
    //===
    public void setRadius(double radius) {
        this.radius = radius;
    }
}
