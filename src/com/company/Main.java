package com.company;

public class Main {
    public static void main(String[] args) {

        Movable ml = new MovablePoint(5, 6,10); // апкастинг
        System.out.println(ml);
        ml .moveLeft();
        System.out.println(ml);
        Movable m2 = new MovableCircle(2,1,2,20); // апкастинг
        System.out.println(m2);
        m2.moveRight();
        System.out.println(m2);


    }
}