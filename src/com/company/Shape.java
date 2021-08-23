package com.company;

public class Shape {
    private String color;

    Shape(String color) { this.color = color; }
    //@Override
    public double getArea() {
        System.out.println("Площадь фигуры неизвестна");
        return 0;
    }
    @Override
    public String toString() { return "color = " + color + "\n"; }
}
