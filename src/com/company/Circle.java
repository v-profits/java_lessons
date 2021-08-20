package com.company;
//тест

public class Circle {
    //public Point center;
    private Point center;
    private double radius;

    public Circle() {
        center = new Point(0, 0);
        radius = 1.0;
    }
    public Circle(int xCenter, int yCenter, double radius) {
        center = new Point(xCenter, yCenter);
        this.radius = radius;
    }
    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public double getRadius() { return this.radius; }
    public Point getCenter() { return this.center; }
    public int getCenterX() { return this.center.getX(); }
    public int getCenterY() { return this.center.getY(); }
    public Point getCenterXY() { return this.center; }

    public void setRadius(double radius) { this.radius = radius; }
    public void setCenter(Point center) { this.center = center; }
    public void setCenterX(int x) { this.center.setX(x); }
    public void setCenterY(int y) { this.center.setY(y);}
    public void setCenterXY(int x, int y) { this.center.setXY(x, y); }

    public String toString() {
        return "Круг: [ центр: " + this.center + ", радиус: " + radius + " ]";
    }
    public double getArea() { //площадь круга S=πR²
        return Math.pow(radius, 2) * Math.PI;
    }
    public double getCircumference() { //длина окружности P=2πR
        return 2 * radius * Math.PI;
    }
    public double distance(Circle another) { //расстояние между центрами двух окружностей
        return this.center.distance(another.center);
    }

}
//    public static final double RADIUS = 1;
//    public static final String COLOR = "красный";
//
//    private double radius;
//    private String color;
//
//    public Circle() { //1-й конструктор
//        radius = RADIUS;
//        color = COLOR;
//    }
//    public Circle(double r) { // 2-й конструктор
//        radius = r;
//        color = COLOR;
//    }
//    public Circle(double r, String c) { // 3-й конструктор
//        radius = r;
//        color = c;
//    }
//    public void setCircle(double radius, String color){
//        this.radius = radius;
//        this.color = color;
//    }
//
//    public double getRadius() {
//        return radius;
//    }
//    public String getColor() {
//        return color;
//    }
//    public double getArea() {
//        return radius * radius * Math.PI;
//    }
//
//    public String toString(){
//        return "Paдиyc = " + this.radius + ", Цвет - " + this.color +
//                ", Площадь = " + this.getArea();
//    }
