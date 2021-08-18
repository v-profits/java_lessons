package com.company;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time() {
        hour = 0;
        minute = 0;
        second = 0;
    }

    public Time(int hour, int minute, int second) {
        if(hour >= 24 || minute >= 60 || second >= 60)
            errorF();
        else {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }
    }

    public int getHour() {
        return this.hour;
    }

    public int getMinute() {
        return this.minute;
    }

    public int getSecond() {
        return this.second;
    }

    public void setHour(int hour) {
        if(hour >= 24)
            errorF();
        else
            this.hour = hour;
    }

    public void setMinute(int minute) {
        if(minute >= 60)
            errorF();
        else
            this.minute = minute;
    }

    public void setSecond(int second) {
        if(second >= 60)
            errorF();
        else
            this.second = second;
    }

    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public void setTime(int hour, int minute, int second) {
        if(hour >= 24 || minute >= 60 || second >= 60)
            errorF();
        else {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }
    }

    public Time nextSecond() {
        if (++second >= 60) {
            second = 0;
            ++minute;
        }
        if (minute >= 60) {
            minute = 0;
            ++hour;
        }
        if (hour >= 24) hour = 0;
        return this;
    }

    private void errorF() {
        System.out.println("ERROR: некорректное значение");
    }
}
