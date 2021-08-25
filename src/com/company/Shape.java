package com.company;

public abstract class Shape {
    //===
    protected String color;
    protected boolean filled;
    //===
    public Shape() { color = "red"; filled = true; }
    public Shape(String color, Boolean filled) { this.color = color; this.filled = filled; }
    //===
    public String getColor() { return color; }
    public Boolean isFilled() { return filled; }
    public abstract double getArea();
    public abstract double getPerimeter();
    @Override
    public String toString() {
        return "\ncolor: " + color + "\nfilled: " + filled;
    }
    //===
    public void setColor() { this.color = color; }
    public void setFilled() { this.filled = filled; }
}