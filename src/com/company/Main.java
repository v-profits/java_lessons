package com.company;

public class Main {
    public static void main(String[] args) {

        Point p = new Point();
        System.out.print(p);

        Point point = new Point(2,3);
        System.out.print(point);

        Point another = new Point(5, 7);
        System.out.print(another);

        System.out.println("Дистанция 1 = " + point.distance(4, 6));
        System.out.println("Дистанция 2 = " + point.distance(another));
        System.out.println("Дистанция 3 = " + point.distance());

    }
}
//        -x:int=O
//        -y:int=O
//        +Point()
//        +Point(x:int, y:int)
//        +getX():int
//        +setX(x:int):void
//        +getY():int
//        +setY(y:int):void
//        +toString(): String
//        +getXY():int[2]
//        +setXY(x:int, y:int):void
//        +distance(x:int, y:int):double
//        +distance(another:Point):double
//        +distance():double
