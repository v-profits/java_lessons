package com.company;
//тест

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
    public Circle(double r, String c) { // 3-й конструктор
        radius = r;
        color = c;
    }
    public void setCircle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }
    public String getColor() {
        return color;
    }
    public double getArea() {
        return radius * radius * Math.PI;
    }

    public String toString(){
        return "Paдиyc = " + this.radius + ", Цвет - " + this.color +
                ", Площадь = " + this.getArea();
    }
}
