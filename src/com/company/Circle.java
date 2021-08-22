package com.company;

public class Circle {
    public static final double RADIUS = 1;
    public static final String COLOR = "красный";
    private double radius;
    private String color;
    public Circle() { //1-й конструктор
        radius = RADIUS;
        color = COLOR;
    }
    public Circle(double r) { // 2-й конструктор
        radius = r;
        color = COLOR;
    }
    public String getColor() { return color; }
    public double getRadius() { return radius; }
    public double getArea() { return Math.pow(radius, 2) * Math.PI; }
    public String toString(){
        return "Paдиyc = " + this.radius + ", Цвет - " + this.color +
                ", Площадь = " + this.getArea();
    }
}