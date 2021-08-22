package com.company;

public class Cylinder_1 extends Circle_1 {
    public final double HEIGTH = 1.0;
    private final double heigth;
    public Cylinder_1() {
        super();
        heigth = HEIGTH;
    }
    public Cylinder_1(double radius) {
        super(radius);
        heigth = HEIGTH;
    }
    public Cylinder_1(double radius, double heigth) {
        super(radius);
        this.heigth = heigth;
    }
    public double getHeigth() { return this.heigth; }
    public double getValume() { return getArea() * heigth; }
    @Override // проверяет переопределенный метод в суперклассе
    public double getArea() { return 2 * Math.PI * getRadius() * heigth + 2 * super.getArea(); } //исползуем методсупер класса
    @Override // проверяет переопределенный метод в суперклассе
    public String toString() { // исползуем метод суперкласса
        return "Цилиндр: \nрадиус = " + getRadius() + "\nвысота = " + getHeigth() +
                "\nцвет = " + getColor() + "\nплощадь основания = " + super.getArea() +
                "\nплощадь цилиндра = " + getArea() + "\nобъем цилиндра = " + getValume() + "\n";
    }
}

