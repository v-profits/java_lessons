package com.company;

public class Cylinder extends Circle {

    public final double HEIGTH = 1.0;
    private final double heigth;
    public Cylinder() {
        super();
        heigth = HEIGTH;
    }
    public Cylinder(int x, int y, double radius, double heigth) {
        super(x, y, radius);
        this.heigth = heigth;
    }
    public Cylinder(Point point, double radius, double heigth) {
        super(point, radius);
        this.heigth = heigth;
    }
    public double getHeigth() { return this.heigth; }
    public double getValume() { return getArea() * heigth; }
    @Override // проверяет переопределенный метод в суперклассе
    public double getArea() { return 2 * Math.PI * getRadius() * heigth + 2 * super.getArea(); } //исползуем методсупер класса
    @Override // проверяет переопределенный метод в суперклассе
    public String toString() { // исползуем метод суперкласса
        return "Цилиндр: \nрадиус = " + getRadius() + "\nвысота = " + getHeigth() +
                "\nплощадь основания = " + super.getArea() + "\nплощадь цилиндра = " + getArea() +
                "\nобъем цилиндра = " + getValume() + "\n";
    }
}

