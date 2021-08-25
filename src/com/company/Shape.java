package com.company;

public abstract class Shape {
    //===
    private String color;
    //===
    Shape() { this.color = "red"; }
    Shape(String color) { this.color = color; }
    //===
    public abstract double getArea();
    @Override
    public String toString() {
        return "color = \"" + color + "\"\n";
    }
}