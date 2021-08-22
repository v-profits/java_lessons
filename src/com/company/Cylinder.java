package com.company;

public class Cylinder extends Circle {
    public final double HEIGTH = 1.0;
    private final double heigth;
    public Cylinder() {
        super();
        heigth = HEIGTH;
    }
    public Cylinder(double radius) {
        super(radius);
        heigth = HEIGTH;
    }
    public Cylinder(double radius, double heigth) {
        super(radius);
        this.heigth = heigth;
    }
    public double getHeigth() { return this.heigth; }
    public double getValume() { return getArea() * heigth; }
    public String toString() {
        return "Цилиндр: \nрадиус = " + getRadius() + "\nвысота = " + getHeigth() +
                "\nцвет = " + getColor() + "\nплощадь окружности = " + getArea() +
                "\nобъем цилиндра = " + getValume() + "\n";
    }
}
