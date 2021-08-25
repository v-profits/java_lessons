package com.company;

public class Main {
    public static void main(String[] args) {
        Movable m = new MovablePoint(3, 5);
        MovablePoint m2 = (MovablePoint)m;
        MovablePoint mp = new MovablePoint(8, 9);

        System.out.println(m + "" + m2 + mp);

        m.moveDown();
        m2.moveLeft();
        mp.moveRigth();
        mp.moveUp();

        System.out.println(m + "" + m2 + mp);
    }
}