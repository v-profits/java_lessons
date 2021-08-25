package com.company;

public class MovablePoint implements Movable {
    //===
    private int x, y;
    //===
    public MovablePoint() {
        x = 0;
        y = 0;
    }
    public MovablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    //===
    @Override
    public void moveUp() { --y; }
    @Override
    public void moveDown() { ++y; }
    @Override
    public void moveLeft() { --x; }
    @Override
    public void moveRigth() { ++x; }
    @Override
    public String toString() {
        return "\nPoint(" + x + ", " + y + ");";
    }
}
