package com.company;

public class Line {
    private Point begin;
    private Point end;

    public Line(int x1, int y1, int x2, int y2){
        begin = new Point(x1, y1);
        end = new Point(x2, y2);
    }
    public Line(Point begin, Point end){
        this.begin = begin;
        this.end = end;
    }
    public Point getBegin(){ return this.begin; }
    public Point getEnd(){ return this.end; }
    public int getBeginX(){ return this.begin.getX(); }
    public int getEndX(){ return this.end.getX(); }
    public int getBeginY(){ return this.begin.getY(); }
    public int getEndY(){ return this.end.getY(); }

    public void setBegin(Point begin){ this.begin = begin; }
    public void setEnd(Point end){ this.end = end; }
    public void setBeginX(int x){ begin.setX(x); }
    public void setEndX(int x){ end.setX(x); }
    public void setBeginY(int y){ begin.setY(y); }
    public void setEndY(int y){ end.setY(y); }

    public int[] getBeginXY(){ return new int[]{ this.begin.getX(), this.begin.getY() }; }
    public int[] getEndXY(){ return this.end.getXY(); }
    public void setBeginXY(int x, int y){ begin.setX(x); begin.setY(y); }
    public void setEndXY(int x, int y){ end.setXY(x, y); }

    public String toString(){ return "Line: [begin: " + begin + ", " + "end: " + end + "]"; }
    public double getLength(){ return begin.distance(end); }

    //=== глава 2, задание 4
    public double getGradient() {
        int xx = Math.abs(this.getBeginX() - this.getEndX());
        int yy = Math.abs(this.getBeginY() - this.getEndY());
        return Math.toDegrees(1.0 * yy / xx);
    }
}