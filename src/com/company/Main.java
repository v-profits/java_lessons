package com.company;

public class Main {
    public static void main(String[] args) {
        Time t1 = new Time();
        System.out.println(t1);

        Time t2 = new Time(1,2,3);
        for(int i = 0; i < 3; ++i)
            System.out.println(t2.nextSecond());

        t2.setHour(4);
        t2.setMinute(5);
        t2.setSecond(6);
        System.out.println(t2);
        System.out.println("Hour: " + t2.getHour());
        System.out.println("Minute: " + t2.getMinute());
        System.out.println("Secund: " + t2.getSecond());

        t2.setTime(23,59,58);
        System.out.println(t2);
        System.out.println(t2.nextSecond());
        System.out.println(t2.nextSecond().nextSecond().nextSecond());
    }
}