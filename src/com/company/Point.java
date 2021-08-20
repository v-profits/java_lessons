package com.company;

public class Point {
    private int x;
    private int y;

    Point() {
        x = 0;
        y = 0;
    }
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() { return this.x; }
    public void setX(int x) { this.x = x; }
    public int getY() { return this.y; }
    public void setY(int y) { this.y = y; }
    public String toString() { return "(" + x + ", " + y + ")\n"; }
    public int[] getXY() { return new int[]{this.x, this.y}; } //+getXY():int[2]

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public double distance(int x, int y) {
        return Math.sqrt(Math.abs(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2)));
    }
    public double distance(Point another) {
        return Math.sqrt(Math.abs(Math.pow(this.x - another.x, 2) + Math.pow(this.y - another.y, 2)));
    }
    public double distance() {
        return Math.sqrt(Math.abs(Math.pow(x, 2) + Math.pow(y, 2)));
    }
}


