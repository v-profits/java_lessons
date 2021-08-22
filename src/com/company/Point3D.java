package com.company;

public class Point3D extends Point {
    private int z;

    Point3D() {
        super();
        z = 0;
    }
    Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
    Point3D(Point point, int z) {
        super(point.getX(), point.getY());
        this.z = z;
    }
    public int getZ() { return this.z; }
    public void setZ(int z) { this.z = z; }
    @Override
    public String toString() {
        return "Point(" + this.getX() + ", " + this.getY() + ", " + z + ")";
    }
    public int[] getXYZ() {
        return new int[]{ this.getX(), this.getY(), z };
    }
    public void setXYZ(int x, int y, int z) {
        this.setX(x);
        this.setY(y);
        this.z = z;
    }
}
