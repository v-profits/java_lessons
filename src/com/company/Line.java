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
    public void setBegin(Point begin){ this.begin = begin; }
    public Point getEnd(){ return this.end; }
    public void setEnd(Point end){ this.end = end; }

    public int getBeginX(){ return this.begin.getX(); }
    public void setBeginX(int x){ begin.setX(x); }
    public int getEndX(){ return this.end.getX(); }
    public void setEndX(int x){ end.setX(x); }

    public int getBeginY(){ return this.begin.getX(); }
    public void setBeginY(int x){ begin.setX(x); }
    public int getEndY(){ return this.end.getX(); }
    public void setEndY(int x){ end.setX(x); }

    public int[] getBeginXY(){ return new int[]{ this.begin.getX(), this.begin.getY() }; }
    public void setBeginXY(int x, int y){ begin.setX(x); begin.setY(y); }
    public int[] getEndXY(){ return this.end.getXY(); }
    public void setEndXY(int x, int y){ end.setXY(x, y); }

    public String toString(){
        //return "Line:[begin: (" + this.begin.getX() + ", " + this.begin.getY() + "), " +
        //"end: (" + this.end.getX() + ", " + this.end.getY() + ")]";
        return "Line: [begin: " + begin + ", " + "end: " + end + "]";
    }
    public double getLength(){
        //return Math.sqrt(Math.abs(Math.pow(this.begin.getX() - this.end.getX(), 2) +
        //       Math.pow(this.begin.getY() - this.end.getY(), 2)));
        return begin.distance(end);
    }
}