package com.company;
public abstract class Shape_2 {
    private String color;
    private boolean filled;
    //===
    public Shape_2() {
        this.color = "red";

        this.filled = true;
    }
    public Shape_2(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    //===
    public String getColor(){
        return this.color;
    }
    //@Override
    public boolean isFilled() {
        return true;
    }
    //@Override
    public abstract double getArea(); /*{
        System.out.println("Площадь фигуры неопределена, отсутствуют данные");
        return 0;
    }*/
    //@Override
    public String toString() {
        return "color = " + color + "\nfilled = " + filled + "\n";
    }
    //===
    public void setColor(String color) {
        this.color = color;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

}
